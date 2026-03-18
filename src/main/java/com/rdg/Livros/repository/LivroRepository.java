package com.rdg.Livros.repository;

import com.rdg.Livros.models.LivroModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<LivroModel, Long> {

}
