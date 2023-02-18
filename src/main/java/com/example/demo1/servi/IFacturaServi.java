package com.example.demo1.servi;

import com.example.demo1.modelo.Factura;

public interface IFacturaServi {
	public void crear(Factura factura);
	public void Actualizar (Factura factura);
	public Factura buscar (Factura id);
	public void borrar (Factura id);
}
