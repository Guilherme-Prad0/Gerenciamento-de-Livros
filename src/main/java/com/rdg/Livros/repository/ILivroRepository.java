package com.rdg.Livros.repository;

import com.rdg.Livros.models.LivroModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILivroRepository extends JpaRepository<LivroModel, Long> {

}
