package com.example.demo1.modelo;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name= "item")
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "item_seq")
	@SequenceGenerator(name = "item_seq", sequenceName = "item_seq", allocationSize = 1)

@Column(name="it_id")
private Integer id;	

 @Column(name= "it_codigoBarras")
 private Integer codigo;
 
 @Column(name= "it_nombre")
 private String nombre;
 
 @Column(name= "it_tipo")
 private String tipo;
 
 @Column(name= "it_stock")
 private Integer stock;
 
 @Column(name= "it_precio")
 private BigDecimal precio;
 
 
 @OneToMany(mappedBy = "item", cascade =CascadeType.ALL, fetch = FetchType.EAGER ) 
 private List<DetalleFactura> detalleFactura;
 
 // SET y GET
 
 

public Integer getCodigo() {
	return codigo;
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public List<DetalleFactura> getDetalleFactura() {
	return detalleFactura;
}

public void setDetalleFactura(List<DetalleFactura> detalleFactura) {
	this.detalleFactura = detalleFactura;
}

public void setCodigo(Integer codigo) {
	this.codigo = codigo;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getTipo() {
	return tipo;
}

public void setTipo(String tipo) {
	this.tipo = tipo;
}

public Integer getStock() {
	return stock;
}

public void setStock(Integer stock) {
	this.stock = stock;
}

public BigDecimal getPrecio() {
	return precio;
}

public void setPrecio(BigDecimal precio) {
	this.precio = precio;
}

@Override
public String toString() {
	return "Item [codigo=" + codigo + ", nombre=" + nombre + ", tipo=" + tipo + ", stock=" + stock + ", precio="
			+ precio + "]";
}
 
 
}
