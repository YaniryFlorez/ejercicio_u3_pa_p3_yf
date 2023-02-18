package com.example.demo1.servi;

import com.example.demo1.modelo.Item;

public interface IItemServi {
	public void crear(Item item);
	public void Actualizar (Item item);
	public Item buscar (Item id);
	public void borrar (Item id);
}
