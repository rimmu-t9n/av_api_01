package com.tiago.avapi01.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tiago.avapi01.entities.Livro;
import com.tiago.avapi01.services.LivroService;

@RestController
@RequestMapping(value="/livros")
public class LivroController {
	@Autowired
	private LivroService service;
	
	@GetMapping
	public ResponseEntity<List<Livro>> getAllLivros() {
		List<Livro> lista = service.getAllLivros();
		return ResponseEntity.status(HttpStatus.OK).body(lista);
	}
	@PostMapping
	public ResponseEntity<String> saveLivro(@RequestBody Livro livro){
		service.saveLivro(livro);
		return ResponseEntity.status(HttpStatus.CREATED).body("Livro cadastrado.");
	}
}