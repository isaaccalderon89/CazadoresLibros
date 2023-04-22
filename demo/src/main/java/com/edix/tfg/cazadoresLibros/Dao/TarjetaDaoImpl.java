package com.edix.tfg.cazadoresLibros.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.edix.tfg.cazadoresLibros.beans.Tarjeta;
import com.edix.tfg.cazadoresLibros.repository.TarjetaRepository;

public class TarjetaDaoImpl implements IntTarjetaDao {
	
	@Autowired
	TarjetaRepository trepo;
	

	@Override
	public List<Tarjeta> findAll() {
		return trepo.findAll();
	}

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

	@Override
	public int eliminarTarjeta(int Tarjeta) {
		// TODO Auto-generated method stub
		return 0;
	}

}
