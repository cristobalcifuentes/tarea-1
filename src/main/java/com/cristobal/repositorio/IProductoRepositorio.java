package com.cristobal.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristobal.modelo.entidades.Producto;

public interface IProductoRepositorio extends JpaRepository<Producto, Integer> {

}
