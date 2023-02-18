package com.example.demo1.servi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.modelo.Factura;
import com.example.demo1.repo.IFacturaRepo;

@Service
public class FacturaServImpl implements IFacturaServi {
	
	@Autowired
	private IFacturaRepo facturaRepo;
	

	@Override
	public void crear(Factura factura) {
		// TODO Auto-generated method stub
		this.facturaRepo.ingresar(factura);
	}

	@Override
	public void Actualizar(Factura factura) {
		// TODO Auto-generated method stub
		this.facturaRepo.Actualizar(factura);
	}

	@Override
	public Factura buscar(Factura id) {
		// TODO Auto-generated method stub
		return this.buscar(id);
	}

	@Override
	public void borrar(Factura id) {
		// TODO Auto-generated method stub
		this.facturaRepo.Eliminar(id);
	}

}
