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

import com.cristobal.modelo.entidades.CompraProducto;
import com.cristobal.servicio.implementacion.CompraProductoServicio;

@RestController
@RequestMapping("/compraproductos")
public class CompraProductoControlador {
	
	@Autowired
	private CompraProductoServicio compraSer;
	
	@GetMapping
	public ResponseEntity<List<CompraProducto>> listar(){
		
		List<CompraProducto> compras = compraSer.listar();
		return new ResponseEntity<List<CompraProducto>>(compras, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<CompraProducto> listarPorId(@PathVariable("id") Integer id){
		
		CompraProducto compra = compraSer.leerPorId(id);
		return new ResponseEntity<CompraProducto>(compra, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<CompraProducto> registrar(@RequestBody CompraProducto compra){
		
		CompraProducto comp = compraSer.registrar(compra);
		return new ResponseEntity<CompraProducto>(comp, HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<CompraProducto> modificar (@RequestBody CompraProducto compra){
		
		CompraProducto comp = compraSer.registrar(compra);
		return new ResponseEntity<CompraProducto>(comp, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Integer> eliminar(@PathVariable("id") Integer id){
		
		compraSer.eliminar(id);
		return new ResponseEntity<>(id, HttpStatus.OK);
	}

}
