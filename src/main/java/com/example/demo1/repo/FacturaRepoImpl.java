package com.example.demo1.repo;

import org.springframework.stereotype.Repository;

import com.example.demo1.modelo.Factura;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Transactional
@Repository
public class FacturaRepoImpl implements IFacturaRepo{
	
	@PersistenceContext
	private EntityManager entityManager;
	

	@Override
	public void ingresar(Factura factura) {
		// TODO Auto-generated method stub
		this.entityManager.persist(factura);
	}

	@Override
	public void Actualizar(Factura factura) {
		// TODO Auto-generated method stub
		this.entityManager.merge(factura);
		
	}

	@Override
	public Factura buscar(Factura id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Factura.class, id);
	}

	@Override
	public void Eliminar(Factura id) {
		// TODO Auto-generated method stub
		Factura factu=this.buscar(id);
		this.entityManager.remove(factu);
	}


}
