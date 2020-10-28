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

import com.cristobal.modelo.entidades.Cliente;
import com.cristobal.servicio.implementacion.ClienteServicio;

@RestController
@RequestMapping("/clientes")
public class ClienteControlador {
	
	@Autowired
	private ClienteServicio clienteSer;
	
	@GetMapping
	public ResponseEntity<List<Cliente>> listar(){
		
		List<Cliente> clientes = clienteSer.listar();
		return new ResponseEntity<List<Cliente>>(clientes, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Cliente> listarPorId(@PathVariable("id") Integer id){
		
		Cliente cliente = clienteSer.leerPorId(id);
		return new ResponseEntity<Cliente>(cliente, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Cliente> registrar(@RequestBody Cliente cliente){
		
		Cliente cli = clienteSer.registrar(cliente);
		return new ResponseEntity<Cliente>(cli, HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Cliente> modificar (@RequestBody Cliente cliente){
		
		Cliente cli = clienteSer.registrar(cliente);
		return new ResponseEntity<Cliente>(cli, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Integer> eliminar(@PathVariable("id") Integer id){
		
		clienteSer.eliminar(id);
		return new ResponseEntity<>(id, HttpStatus.OK);
	}
	
	
	
	
	
	
	
	

}
