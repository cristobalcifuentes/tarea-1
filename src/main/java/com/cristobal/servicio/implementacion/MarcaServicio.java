package com.cristobal.servicio.implementacion;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cristobal.modelo.entidades.Marca;
import com.cristobal.repositorio.IMarcaRepositorio;
import com.cristobal.servicio.interfaces.IMarcaServicio;

@Service
public class MarcaServicio implements IMarcaServicio {
	
	@Autowired
	private IMarcaRepositorio marcaRep;

	@Override
	public Marca registrar(Marca marca) {
		
		return marcaRep.save(marca);
	}

	@Override
	public Marca modificar(Marca marca) {
		
		return marcaRep.save(marca);
	}

	@Override
	public List<Marca> listar() {
		
		return marcaRep.findAll();
	}

	@Override
	public Marca leerPorId(Integer id) {
		
		Optional<Marca> marca = marcaRep.findById(id);
		
		return marca.isPresent() ? marca.get() : new Marca();
	}

	@Override
	public boolean eliminar(Integer id) {
		
		marcaRep.deleteById(id);
		return true;
	}

}
