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

import com.cristobal.modelo.entidades.Supervisor;
import com.cristobal.servicio.implementacion.SupervisorServicio;

@RestController
@RequestMapping("/supervisores")
public class SupervisorControlador {
	
	@Autowired
	private SupervisorServicio supervisorSer;
	
	@GetMapping
	public ResponseEntity<List<Supervisor>> listar(){
		
		List<Supervisor> supervisors = supervisorSer.listar();
		return new ResponseEntity<List<Supervisor>>(supervisors, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Supervisor> listarPorId(@PathVariable("id") Integer id){
		
		Supervisor supervisor = supervisorSer.leerPorId(id);
		return new ResponseEntity<Supervisor>(supervisor, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Supervisor> registrar(@RequestBody Supervisor supervisor){
		
		Supervisor superv = supervisorSer.registrar(supervisor);
		return new ResponseEntity<Supervisor>(superv, HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Supervisor> modificar (@RequestBody Supervisor supervisor){
		
		Supervisor superv = supervisorSer.registrar(supervisor);
		return new ResponseEntity<Supervisor>(superv, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Integer> eliminar(@PathVariable("id") Integer id){
		
		supervisorSer.eliminar(id);
		return new ResponseEntity<>(id, HttpStatus.OK);
	}

}
