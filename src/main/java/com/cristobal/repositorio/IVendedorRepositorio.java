package com.cristobal.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristobal.modelo.entidades.Vendedor;

public interface IVendedorRepositorio extends JpaRepository<Vendedor, Integer> {

}
