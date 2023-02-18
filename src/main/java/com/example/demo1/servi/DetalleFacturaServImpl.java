package com.example.demo1.servi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.modelo.DetalleFactura;
import com.example.demo1.repo.IDetalleFacturaRepo;
import com.example.demo1.repo.IFacturaRepo;

@Service
public class DetalleFacturaServImpl implements IDetalleFacturaServi{
	
	@Autowired
	private IDetalleFacturaRepo detalFactRepo;
	

	@Override
	public void crear(DetalleFactura defactura) {
		// TODO Auto-generated method stub
		this.detalFactRepo.ingresar(defactura);
	}

	@Override
	public void Actualizar(DetalleFactura defactura) {
		// TODO Auto-generated method stub
		this.detalFactRepo.Actualizar(defactura);
	}

	@Override
	public DetalleFactura buscar(DetalleFactura id) {
		// TODO Auto-generated method stub
		return this.detalFactRepo.buscar(id);
	}

	@Override
	public void borrar(DetalleFactura id) {
		// TODO Auto-generated method stub
		this.detalFactRepo.Eliminar(id);
	}

}
