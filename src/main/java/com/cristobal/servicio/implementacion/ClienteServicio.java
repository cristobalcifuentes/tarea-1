package com.cristobal.servicio.implementacion;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cristobal.modelo.entidades.Cliente;
import com.cristobal.repositorio.IClienteRepositorio;
import com.cristobal.servicio.interfaces.IClienteServicio;

@Service
public class ClienteServicio implements IClienteServicio {
	
	@Autowired
	private IClienteRepositorio clienteRep;

	@Override
	public Cliente registrar(Cliente cliente) {
		
		return clienteRep.save(cliente);
	}

	@Override
	public Cliente modificar(Cliente cliente) {
	
		return clienteRep.save(cliente);
	}

	@Override
	public List<Cliente> listar() {
		
		return clienteRep.findAll();
	}

	@Override
	public Cliente leerPorId(Integer id) {
		
		Optional<Cliente> cliente = clienteRep.findById(id);
		return cliente.isPresent() ? cliente.get() : new Cliente();
		
	}

	@Override
	public boolean eliminar(Integer id) {
		
		clienteRep.deleteById(id);
		return true;
	}

}
