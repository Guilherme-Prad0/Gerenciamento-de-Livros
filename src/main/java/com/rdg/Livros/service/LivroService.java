package com.rdg.Livros.service;

import com.rdg.Livros.models.LivroModel;
import com.rdg.Livros.repository.ILivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    private ILivroRepository livroRepository;

    public LivroModel criarLivro(LivroModel livroModel){
        return livroRepository.save(livroModel);
    }

    public List<LivroModel> findAll(){
        return livroRepository.findAll();
    }

    public LivroModel findById(Long id) {
        return livroRepository.findById(id)
                .orElse(null);
    }

    public void delete(Long id){
        livroRepository.deleteById(id);
    }

    public LivroModel update(Long id, LivroModel livroModel){
        LivroModel livro = livroRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Livro não encontrado"));

        livro.setTituloLivro(livroModel.getTituloLivro());
        livro.setAutor(livroModel.getAutor());
        livro.setAnoPublicacao(livroModel.getAnoPublicacao());

        return livroRepository.save(livro);
    }
}