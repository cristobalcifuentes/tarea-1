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

import com.cristobal.modelo.entidades.Vendedor;
import com.cristobal.servicio.implementacion.VendedorServicio;

@RestController
@RequestMapping("/vendedores")
public class VendedorControlador {
	
	@Autowired
	private VendedorServicio vendedorSer;
	
	@GetMapping
	public ResponseEntity<List<Vendedor>> listar(){
		
		List<Vendedor> vendedors = vendedorSer.listar();
		return new ResponseEntity<List<Vendedor>>(vendedors, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Vendedor> listarPorId(@PathVariable("id") Integer id){
		
		Vendedor vendedor = vendedorSer.leerPorId(id);
		return new ResponseEntity<Vendedor>(vendedor, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Vendedor> registrar(@RequestBody Vendedor vendedor){
		
		Vendedor vend = vendedorSer.registrar(vendedor);
		return new ResponseEntity<Vendedor>(vend, HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Vendedor> modificar (@RequestBody Vendedor vendedor){
		
		Vendedor vend = vendedorSer.registrar(vendedor);
		return new ResponseEntity<Vendedor>(vend, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Integer> eliminar(@PathVariable("id") Integer id){
		
		vendedorSer.eliminar(id);
		return new ResponseEntity<>(id, HttpStatus.OK);
	}

}
