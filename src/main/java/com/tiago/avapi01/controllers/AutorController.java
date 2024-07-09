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

import com.tiago.avapi01.entities.Autor;
import com.tiago.avapi01.services.AutorService;

@RestController
@RequestMapping(value="/autores")
public class AutorController {
	@Autowired
	private AutorService service;
	
	@GetMapping
	public ResponseEntity<List<Autor>> getAllAutores() {
		List<Autor> lista = service.getAllAutores();
		return ResponseEntity.status(HttpStatus.OK).body(lista);
	}	
	@PostMapping
	public ResponseEntity<String> saveAutor(@RequestBody Autor autor){
		service.saveAutor(autor);
		return ResponseEntity.status(HttpStatus.CREATED).body("Autor cadastrado.");
	}
}