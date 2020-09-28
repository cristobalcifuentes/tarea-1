package com.cristobal.modelo.entidades;

import java.io.Serializable;

public class PKCompraProducto implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5394637651819792324L;



	private int producto;
	
	private int venta;

	public int getProducto() {
		return producto;
	}

	public void setProducto(int producto) {
		this.producto = producto;
	}

	public int getVenta() {
		return venta;
	}

	public void setVenta(int venta) {
		this.venta = venta;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	

}
