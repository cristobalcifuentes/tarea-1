package com.cristobal.servicio.implementacion;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cristobal.modelo.entidades.CompraProducto;
import com.cristobal.repositorio.ICompraProductoRepositorio;
import com.cristobal.servicio.interfaces.ICompraProductoServicio;

@Service
public class CompraProductoServicio implements ICompraProductoServicio {
	
	@Autowired
	private ICompraProductoRepositorio compraProductoRep;

	@Override
	public CompraProducto registrar(CompraProducto compraProducto) {
		
		return compraProductoRep.save(compraProducto);
	}

	@Override
	public CompraProducto modificar(CompraProducto compraProducto) {
		// TODO Auto-generated method stub
		return compraProductoRep.save(compraProducto);
	}

	@Override
	public List<CompraProducto> listar() {
		// TODO Auto-generated method stub
		return compraProductoRep.findAll();
	}

	@Override
	public CompraProducto leerPorId(Integer id) {
		
		Optional<CompraProducto> compra = compraProductoRep.findById(id);
		return compra.isPresent() ? compra.get() : new CompraProducto();
	}

	@Override
	public boolean eliminar(Integer id) {
		
		compraProductoRep.deleteById(id);
		return true;
	}

}
