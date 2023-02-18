package com.example.demo1.servi;

import com.example.demo1.modelo.DetalleFactura;

public interface IDetalleFacturaServi {
	public void crear(DetalleFactura defactura);
	public void Actualizar (DetalleFactura defactura);
	public DetalleFactura buscar (DetalleFactura id);
	public void borrar (DetalleFactura id);
}
