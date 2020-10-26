package com.cristobal.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristobal.modelo.entidades.Marca;

public interface IMarcaRepositorio extends JpaRepository<Marca, Integer> {

}
