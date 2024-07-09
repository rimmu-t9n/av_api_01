package com.tiago.avapi01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tiago.avapi01.entities.Autor;

@Repository
public interface AutorRepository extends JpaRepository <Autor, Long> {}