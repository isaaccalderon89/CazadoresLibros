package com.edix.tfg.cazadoresLibros.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.edix.tfg.cazadoresLibros.beans.Tarjeta;
import com.edix.tfg.cazadoresLibros.repository.TarjetaRepository;

public class TarjetaDaoImpl implements IntTarjetaDao {
	
	@Autowired
	TarjetaRepository trepo;
	
	// Método para listar las tarjetas 
	@Override
	public List<Tarjeta> findAll() {
		return trepo.findAll();
	}
	
	// Método para registrar una tarjeta
	@Override
	public int registrarTarjeta(Tarjeta tarjeta) {
		
		int filas = 0;
		try {
			trepo.save(tarjeta);
			filas =1;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return filas;
		
	}
	
	// Método para eliminar una tarjeta
	@Override
	public int eliminarTarjeta(int idTarjeta) {
		int filas = 0;
		try {
			trepo.deleteById(idTarjeta);
			filas = 1;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return filas;
	}

}
