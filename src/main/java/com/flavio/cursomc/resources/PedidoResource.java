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

import com.flavio.cursomc.domain.Pedido;
import com.flavio.cursomc.services.PedidoService;

@RestController
@RequestMapping(value="/pedidos")
public class PedidoResource {
	
	@Autowired
	private PedidoService service;
	
	@GetMapping("/{id}")
	public ResponseEntity<Pedido> find(@PathVariable Integer id) {
		
		Pedido obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);

	}
	
	
}
