package com.example.demo1.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
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
@Table(name= "factura")
public class Factura {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "fac_seq")
	@SequenceGenerator(name = "fac_seq", sequenceName = "fac_seq", allocationSize = 1)
	
	@Column(name="fac_id")
	private Integer id;
	
	@Column(name="fac_numero")
	private String numero;
	
	@Column(name="fac_fecha")
	private LocalDateTime fecha;
	
	@Column(name="fac_cedulaCliente")
	private String cedula;
	
	@Column(name="fac_totalVenta")
	private BigDecimal total;
	
	@OneToMany(mappedBy = "factura", cascade =CascadeType.ALL, fetch = FetchType.EAGER ) 
	 private List<DetalleFactura> detalleFactura;
	
	//SET y GET
	
	

	public Integer getId() {
		return id;
	}

	public List<DetalleFactura> getDetalleFactura() {
		return detalleFactura;
	}

	public void setDetalleFactura(List<DetalleFactura> detalleFactura) {
		this.detalleFactura = detalleFactura;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Factura [id=" + id + ", numero=" + numero + ", fecha=" + fecha + ", cedula=" + cedula + ", total="
				+ total + "]";
	}
	
	
	

}
