package com.gerenciamento.Livros.Repository;

import com.gerenciamento.Livros.Entity.LivroEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository <LivroEntity, Long> {
}
