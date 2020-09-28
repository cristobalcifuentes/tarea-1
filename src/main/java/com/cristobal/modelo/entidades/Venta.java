package com.cristobal.modelo.entidades;

import java.util.Date;

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
@Table(name = "venta")
public class Venta {
	
	
	@Id
	@Column(name="venta_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "costo", nullable = true)
	private long costo;
	
	
	@Column(name = "fecha", nullable = true)
	private Date fecha;
	
	@ManyToOne
	@JoinColumn(name = "vendedor_id", nullable = false, foreignKey = @ForeignKey(name = "FK_venta_vendedor"))
	private Vendedor vendedor;
	
	
	@ManyToOne
	@JoinColumn(name = "cliente_id", nullable = false, foreignKey = @ForeignKey(name = "FK_venta_cliente"))
	private Cliente cliente;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public long getCosto() {
		return costo;
	}


	public void setCosto(long costo) {
		this.costo = costo;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public Vendedor getVendedor() {
		return vendedor;
	}


	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
	

}
