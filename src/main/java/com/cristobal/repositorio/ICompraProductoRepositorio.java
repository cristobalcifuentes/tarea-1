package com.cristobal.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristobal.modelo.entidades.CompraProducto;

public interface ICompraProductoRepositorio extends JpaRepository<CompraProducto, Integer> {

}
