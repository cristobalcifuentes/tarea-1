package com.cristobal.servicio.implementacion;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cristobal.modelo.entidades.Venta;
import com.cristobal.repositorio.IVentaRepositorio;
import com.cristobal.servicio.interfaces.IVentaServicio;

@Service
public class VentaServicio implements IVentaServicio {
	
	@Autowired
	private IVentaRepositorio ventaRep;

	@Override
	public Venta registrar(Venta venta) {
		
		return ventaRep.save(venta);
	}

	@Override
	public Venta modificar(Venta venta) {
	
		return ventaRep.save(venta);
	}

	@Override
	public List<Venta> listar() {
		
		return ventaRep.findAll();
	}

	@Override
	public Venta leerPorId(Integer id) {
		
		Optional<Venta> venta = ventaRep.findById(id);
		return venta.isPresent() ? venta.get() : new Venta();
	}

	@Override
	public boolean eliminar(Integer id) {
		
		ventaRep.deleteById(id);
		return true;
	}

}
