package com.cristobal.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cristobal.modelo.entidades.Marca;
import com.cristobal.servicio.implementacion.MarcaServicio;

@RestController
@RequestMapping("/marcas")
public class MarcaControlador {
	
	@Autowired
	private MarcaServicio marcaSer;
	
	@GetMapping
	public ResponseEntity<List<Marca>> listar(){
		
		List<Marca> marcas = marcaSer.listar();
		return new ResponseEntity<List<Marca>>(marcas, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Marca> listarPorId(@PathVariable("id") Integer id){
		
		Marca marca = marcaSer.leerPorId(id);
		return new ResponseEntity<Marca>(marca, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Marca> registrar(@RequestBody Marca marca){
		
		Marca mar = marcaSer.registrar(marca);
		return new ResponseEntity<Marca>(mar, HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Marca> modificar (@RequestBody Marca marca){
		
		Marca mar = marcaSer.registrar(marca);
		return new ResponseEntity<Marca>(mar, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Integer> eliminar(@PathVariable("id") Integer id){
		
		marcaSer.eliminar(id);
		return new ResponseEntity<>(id, HttpStatus.OK);
	}

}
