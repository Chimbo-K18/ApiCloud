/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ista.atlas.Api.en.la.Nube.controllers;

import com.ista.atlas.Api.en.la.Nube.models.Producto;
import com.ista.atlas.Api.en.la.Nube.repositories.IProductoDAO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author matei
 */

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,
		RequestMethod.DELETE })
@RequestMapping("/api/productos")
public class ProductoController {
    
    @Autowired
	private IProductoDAO repository;

	@PostMapping("/producto")
	public Producto create(@Validated @RequestBody Producto p) {
		return repository.insert(p);
	}

	@GetMapping("/")
	public List<Producto> readAll() {
		return repository.findAll();
	}

	@PutMapping("/producto/{id}")
	public Producto update(@PathVariable String id, @Validated @RequestBody Producto p) {
		return repository.save(p);
	}

	@DeleteMapping("/producto/{id}")
	public void delete(@PathVariable String id) {
		repository.deleteById(id);
	}
}
