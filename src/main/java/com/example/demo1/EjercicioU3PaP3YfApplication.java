package com.example.demo1;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo1.modelo.Item;
import com.example.demo1.servi.IDetalleFacturaServi;
import com.example.demo1.servi.IFacturaServi;
import com.example.demo1.servi.IItemServi;

@SpringBootApplication
public class EjercicioU3PaP3YfApplication implements CommandLineRunner{
	
	@Autowired 
     private IItemServi itemServi;
	
	@Autowired 
    private IFacturaServi facturaservi;
	
	@Autowired 
    private IDetalleFacturaServi detalSErvi;
	

	public static void main(String[] args) {
		SpringApplication.run(EjercicioU3PaP3YfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		 Item ite= new Item();
		 
		 ite.setCodigo(1234);
		 ite.setNombre("Galletas");
		 ite.setTipo("Dulces");
		 ite.setStock(20);
		 ite.setPrecio(new BigDecimal(120));
		 
		 this.itemServi.crear(ite);
	}

}
