package com.edix.tfg.cazadoresLibros.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.edix.tfg.cazadoresLibros.beans.Descarga;
import com.edix.tfg.cazadoresLibros.repository.DescargaRepository;

public class DescargaDaoImplMy8 implements DescargaDao{
	
	@Autowired
	private DescargaRepository desRepo;
	
	// Método que devuelve una lista de todos los libros descargados
	@Override
	public List<Descarga> findAll() {
		return desRepo.findAll();
	}

	// Método que devuelve una descarga por su idDescarga
	@Override
	public Descarga finById(int idDescarga) {
		Descarga descarga = new Descarga();
		descarga.setIdDescarga(idDescarga);
		int pos = desRepo.findAll().indexOf(descarga);
		if (pos == - 1) {
			return null;
		} else {
			return desRepo.findById(idDescarga).orElse(null);
		}		
	}
}
