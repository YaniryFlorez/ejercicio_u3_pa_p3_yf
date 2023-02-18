package com.example.demo1.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name= "detallefactura")
public class DetalleFactura {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "detal_seq")
	@SequenceGenerator(name = "detal_seq", sequenceName = "detal_seq", allocationSize = 1)

    @Column(name= "det_id")
    private Integer id;
	
	 @Column(name= "det_cantidad")
	 private Integer cantidad;
	 
	 @Column(name= "det_precio_unit")
	 private BigDecimal precio;
	 
	 @Column(name= "det_subtotal")
	 private BigDecimal subtotal;
	 
	 @ManyToOne
	 @JoinColumn(name = "det_id_factura") private Factura factura;
	 
	 @ManyToOne
	 @JoinColumn(name = "det_id_item") private Item item;
	 
		//SET y GET

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public BigDecimal getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "DetalleFactura [id=" + id + ", cantidad=" + cantidad + ", precio=" + precio + ", subtotal=" + subtotal
				+ "]";
	}
 

}
