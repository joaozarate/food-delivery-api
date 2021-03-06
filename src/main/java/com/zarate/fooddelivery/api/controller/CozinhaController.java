package com.zarate.fooddelivery.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zarate.fooddelivery.api.model.CozinhasXmlWrapper;
import com.zarate.fooddelivery.domain.model.Cozinha;
import com.zarate.fooddelivery.domain.repository.CozinhaRepository;

@RestController
@RequestMapping("/cozinhas")
public class CozinhaController {

	@Autowired
	private CozinhaRepository repository;

	@GetMapping
	public List<Cozinha> listar() {
		return repository.findAll();
	}
	
	@GetMapping(produces = MediaType.APPLICATION_XML_VALUE)
	public CozinhasXmlWrapper listarXml() {
		return new CozinhasXmlWrapper(repository.findAll());
	}

	@GetMapping("/{id}")
	public Cozinha buscar(@PathVariable Long id) {
		Optional<Cozinha> cozinha = repository.findById(id);
		return cozinha.get();
	}

}
