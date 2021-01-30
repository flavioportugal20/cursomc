package com.flavio.cursomc.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flavio.cursomc.domain.Categoria;
import com.flavio.cursomc.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@Autowired
	private CategoriaService service;
	
	@GetMapping("/{id}")
	public ResponseEntity<Categoria> find(@PathVariable Integer id) {
		
		Categoria obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);

	}
	
	
}
