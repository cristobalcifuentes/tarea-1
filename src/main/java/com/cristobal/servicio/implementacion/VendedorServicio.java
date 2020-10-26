package com.cristobal.servicio.implementacion;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cristobal.modelo.entidades.Vendedor;
import com.cristobal.repositorio.IVendedorRepositorio;
import com.cristobal.servicio.interfaces.IVendedorServicio;

@Service
public class VendedorServicio implements IVendedorServicio {
	
	@Autowired
	private IVendedorRepositorio vendedorRep;

	@Override
	public Vendedor registrar(Vendedor vendedor) {
		
		return vendedorRep.save(vendedor);
	}

	@Override
	public Vendedor modificar(Vendedor vendedor) {
		
		return vendedorRep.save(vendedor);
	}

	@Override
	public List<Vendedor> listar() {
		
		return vendedorRep.findAll();
	}

	@Override
	public Vendedor leerPorId(Integer id) {
		
		Optional<Vendedor> vendedor = vendedorRep.findById(id);
		return vendedor.isPresent() ? vendedor.get() : new Vendedor();
	}

	@Override
	public boolean eliminar(Integer id) {
		
		vendedorRep.deleteById(id);
		return false;
	}

}
