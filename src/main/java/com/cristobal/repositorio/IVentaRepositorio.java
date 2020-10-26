package com.cristobal.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristobal.modelo.entidades.Venta;

public interface IVentaRepositorio extends JpaRepository<Venta, Integer> {

}
