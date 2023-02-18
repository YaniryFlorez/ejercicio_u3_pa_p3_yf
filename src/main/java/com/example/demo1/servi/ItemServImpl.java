package com.example.demo1.servi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.modelo.Item;
import com.example.demo1.repo.IItemRepo;

@Service
public class ItemServImpl implements IItemServi{
	
	@Autowired
	private IItemRepo itemRepo;

	@Override
	public void crear(Item item) {
		// TODO Auto-generated method stub
		this.itemRepo.ingresar(item);
	}

	@Override
	public void Actualizar(Item item) {
		// TODO Auto-generated method stub
		this.itemRepo.Actualizar(item);
	}

	@Override
	public Item buscar(Item id) {
		// TODO Auto-generated method stub
		return this.buscar(id);
	}

	@Override
	public void borrar(Item id) {
		// TODO Auto-generated method stub
		this.itemRepo.Eliminar(id);
	}

}
