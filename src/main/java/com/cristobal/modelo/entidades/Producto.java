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
@Table(name = "producto")
public class Producto {
	
	
	@Id
	@Column(name="producto_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "descripcion", length = 100, nullable = true)
	private String descripcion;
	
	
	@Column(name = "valor", nullable = true)
	private long valor;
	
	
	@Column(name = "producto", length = 30, nullable = true)
	private String producto;
	
	
	@ManyToOne
	@JoinColumn(name = "marca_id", nullable = false, foreignKey = @ForeignKey(name = "FK_producto_marca"))
	private Marca marca;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public long getValor() {
		return valor;
	}


	public void setValor(long valor) {
		this.valor = valor;
	}


	public String getProducto() {
		return producto;
	}


	public void setProducto(String producto) {
		this.producto = producto;
	}


	public Marca getMarca() {
		return marca;
	}


	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	
	
	
	

}
