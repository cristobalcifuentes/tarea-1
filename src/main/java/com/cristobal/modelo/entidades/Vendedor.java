package com.cristobal.modelo.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "vendedor")
public class Vendedor {
	
	@Id
	@Column(name="vendedor_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "nombre", length = 30, nullable = true)
	private String nombre;
	
	@Column(name = "direccion", length = 50, nullable = true)
	private String direccion;
	
	@Column(name = "vendedor", length = 30, nullable = true)
	private String vendedor;
	
	@ManyToOne
	@JoinColumn(name = "supervisor_id", nullable = false, foreignKey = @ForeignKey(name = "FK_vendedor_supervisor"))
	private Supervisor supervisor;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getVendedor() {
		return vendedor;
	}

	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}

	public Supervisor getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Supervisor supervisor) {
		this.supervisor = supervisor;
	}
	
	
	
	

}
