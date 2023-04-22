package com.edix.tfg.cazadoresLibros.Dao;

import java.util.List;

import com.edix.tfg.cazadoresLibros.beans.Tarjeta;

public interface IntTarjetaDao {
	
	//Método que lista tarjetas
	List<Tarjeta> findAll();
	//Método que registra tarjetas 
	int registrarTarjeta (Tarjeta tarjeta);
	//Método que elimina tarjetas
	int eliminarTarjeta (int idTarjeta);
	
}
