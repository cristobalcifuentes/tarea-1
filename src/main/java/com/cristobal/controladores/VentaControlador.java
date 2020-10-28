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

import com.cristobal.modelo.entidades.Venta;
import com.cristobal.servicio.implementacion.VentaServicio;

@RestController
@RequestMapping("/venta")
public class VentaControlador {
	
	@Autowired
	private VentaServicio ventaSer;
	
	@GetMapping
	public ResponseEntity<List<Venta>> listar(){
		
		List<Venta> ventas = ventaSer.listar();
		return new ResponseEntity<List<Venta>>(ventas, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Venta> listarPorId(@PathVariable("id") Integer id){
		
		Venta venta = ventaSer.leerPorId(id);
		return new ResponseEntity<Venta>(venta, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Venta> registrar(@RequestBody Venta venta){
		
		Venta vent = ventaSer.registrar(venta);
		return new ResponseEntity<Venta>(vent, HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Venta> modificar (@RequestBody Venta venta){
		
		Venta vent = ventaSer.registrar(venta);
		return new ResponseEntity<Venta>(vent, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Integer> eliminar(@PathVariable("id") Integer id){
		
		ventaSer.eliminar(id);
		return new ResponseEntity<>(id, HttpStatus.OK);
	}

}
