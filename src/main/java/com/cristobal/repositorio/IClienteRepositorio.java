package com.cristobal.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristobal.modelo.entidades.Cliente;

public interface IClienteRepositorio extends JpaRepository<Cliente, Integer> {

}
