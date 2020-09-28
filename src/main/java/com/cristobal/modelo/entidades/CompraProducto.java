package com.cristobal.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "compra_producto")
@IdClass(PKCompraProducto.class)
public class CompraProducto implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -588884146433047566L;

	@Id
	@ManyToOne
	@JoinColumn(name="producto_id")
	private Producto producto;
	
	@Id
	@ManyToOne
	@JoinColumn(name="venta_id")
	private Venta venta;

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	

}
