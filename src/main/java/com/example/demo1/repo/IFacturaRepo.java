package com.example.demo1.repo;

import com.example.demo1.modelo.Factura;

public interface IFacturaRepo {
	public void ingresar(Factura factura);
	public void Actualizar (Factura factura);
	public Factura buscar (Factura id);
	public void Eliminar (Factura id);
}
