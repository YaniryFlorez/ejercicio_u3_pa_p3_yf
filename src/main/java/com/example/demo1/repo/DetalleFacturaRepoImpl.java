package com.example.demo1.repo;

import org.springframework.stereotype.Repository;

import com.example.demo1.modelo.DetalleFactura;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class DetalleFacturaRepoImpl implements IDetalleFacturaRepo{
	
	@PersistenceContext
	private EntityManager entityManager;
	

	@Override
	public void ingresar(DetalleFactura defactura) {
		// TODO Auto-generated method stub
		this.entityManager.persist(defactura);
	}

	@Override
	public void Actualizar(DetalleFactura defactura) {
		// TODO Auto-generated method stub
		this.entityManager.merge(defactura);
		
	}

	@Override
	public DetalleFactura buscar(DetalleFactura id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(DetalleFactura.class, id);
	}

	@Override
	public void Eliminar(DetalleFactura id) {
		// TODO Auto-generated method stub
		DetalleFactura detalfac=this.buscar(id);
		this.entityManager.remove(detalfac);
	}

}
