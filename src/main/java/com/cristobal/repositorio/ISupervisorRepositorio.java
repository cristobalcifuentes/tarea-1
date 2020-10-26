package com.cristobal.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristobal.modelo.entidades.Supervisor;

public interface ISupervisorRepositorio extends JpaRepository<Supervisor, Integer> {

}
