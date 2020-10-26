package com.cristobal.servicio.implementacion;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cristobal.modelo.entidades.Supervisor;
import com.cristobal.repositorio.ISupervisorRepositorio;
import com.cristobal.servicio.interfaces.ISupervisorServicio;

@Service
public class SupervisorServicio implements ISupervisorServicio {
	
	@Autowired
	private ISupervisorRepositorio supervisorRep;

	@Override
	public Supervisor registrar(Supervisor supervisor) {
		
		return supervisorRep.save(supervisor);
	}

	@Override
	public Supervisor modificar(Supervisor supervisor) {
		
		return supervisorRep.save(supervisor);
	}

	@Override
	public List<Supervisor> listar() {
		
		return supervisorRep.findAll();
	}

	@Override
	public Supervisor leerPorId(Integer id) {
		
		Optional<Supervisor> supervisor = supervisorRep.findById(id);
		return supervisor.isPresent() ? supervisor.get() : new Supervisor();
	}

	@Override
	public boolean eliminar(Integer id) {
		
		supervisorRep.deleteById(id);
		return true;
	}

}
