package com.cristobal.servicio.implementacion;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cristobal.modelo.entidades.Producto;
import com.cristobal.repositorio.IProductoRepositorio;
import com.cristobal.servicio.interfaces.IProductoServicio;

@Service
public class ProductoServicio implements IProductoServicio {
	
	@Autowired
	private IProductoRepositorio productoRep;

	@Override
	public Producto registrar(Producto producto) {
		
		return productoRep.save(producto);
	}

	@Override
	public Producto modificar(Producto producto) {
		
		return productoRep.save(producto);
	}

	@Override
	public List<Producto> listar() {
		
		return productoRep.findAll();
	}

	@Override
	public Producto leerPorId(Integer id) {
		
		Optional<Producto> producto = productoRep.findById(id);
		return producto.isPresent() ? producto.get() : new Producto() ;
	}

	@Override
	public boolean eliminar(Integer id) {
		
		productoRep.deleteById(id);
		return false;
	}

}
