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

import com.cristobal.modelo.entidades.Producto;
import com.cristobal.servicio.implementacion.ProductoServicio;

@RestController
@RequestMapping("/productos")
public class ProductoControlador {
	
	@Autowired
	private ProductoServicio productoSer;
	
	@GetMapping
	public ResponseEntity<List<Producto>> listar(){
		
		List<Producto> productos = productoSer.listar();
		return new ResponseEntity<List<Producto>>(productos, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Producto> listarPorId(@PathVariable("id") Integer id){
		
		Producto producto = productoSer.leerPorId(id);
		return new ResponseEntity<Producto>(producto, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Producto> registrar(@RequestBody Producto producto){
		
		Producto prod = productoSer.registrar(producto);
		return new ResponseEntity<Producto>(prod, HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Producto> modificar (@RequestBody Producto producto){
		
		Producto prod = productoSer.registrar(producto);
		return new ResponseEntity<Producto>(prod, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Integer> eliminar(@PathVariable("id") Integer id){
		
		productoSer.eliminar(id);
		return new ResponseEntity<>(id, HttpStatus.OK);
	}

}
