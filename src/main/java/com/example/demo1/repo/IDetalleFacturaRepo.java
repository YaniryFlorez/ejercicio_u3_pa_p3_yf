package com.example.demo1.repo;

import com.example.demo1.modelo.DetalleFactura;
import com.example.demo1.modelo.Factura;

public interface IDetalleFacturaRepo {
	public void ingresar(DetalleFactura defactura);
	public void Actualizar (DetalleFactura defactura);
	public DetalleFactura buscar (DetalleFactura id);
	public void Eliminar (DetalleFactura id);
	
}
