package com.tiago.avapi01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tiago.avapi01.entities.Livro;

@Repository
public interface LivroRepository extends JpaRepository <Livro, Long> {}
