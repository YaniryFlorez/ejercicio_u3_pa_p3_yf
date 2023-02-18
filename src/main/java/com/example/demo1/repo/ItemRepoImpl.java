package com.example.demo1.repo;

import org.springframework.stereotype.Repository;

import com.example.demo1.modelo.Item;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class ItemRepoImpl implements IItemRepo{
	
	@PersistenceContext
	private EntityManager entityManager;
	

	@Override
	public void ingresar(Item item) {
		// TODO Auto-generated method stub
		this.entityManager.persist(item);
	}

	@Override
	public void Actualizar(Item item) {
		// TODO Auto-generated method stub
		this.entityManager.merge(item);
	}

	@Override
	public Item buscar(Item id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Item.class, id);
	}

	@Override
	public void Eliminar(Item id) {
		// TODO Auto-generated method stub
		Item ite= this.buscar(id);
		this.entityManager.remove(ite);
	}

}
