package com.example.demo1.repo;

import com.example.demo1.modelo.Item;

public interface IItemRepo {

	public void ingresar(Item item);
	public void Actualizar (Item item);
	public Item buscar (Item id);
	public void Eliminar (Item id);
	
	
}
