package com.tiago.avapi01.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiago.avapi01.entities.Autor;
import com.tiago.avapi01.repositories.AutorRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class AutorService {
	@Autowired
	private AutorRepository autorRepository;
	
	public List<Autor> getAllAutores(){
		return autorRepository.findAll();
	}
	public void saveAutor(Autor autor) {
		autorRepository.save(autor);
	}
}