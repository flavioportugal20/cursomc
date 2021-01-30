package com.flavio.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flavio.cursomc.domain.Categoria;
import com.flavio.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService{
	
	@Autowired
	CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.get();
	}
	
}
