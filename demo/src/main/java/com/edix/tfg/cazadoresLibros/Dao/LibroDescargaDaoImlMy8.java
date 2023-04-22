package com.edix.tfg.cazadoresLibros.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.edix.tfg.cazadoresLibros.beans.LibrosDescarga;
import com.edix.tfg.cazadoresLibros.repository.LibroDescargaRepository;

public class LibroDescargaDaoImlMy8 implements LibrosDescargaDao{
	
	@Autowired 
	LibroDescargaRepository lideRepo;
	
	@Override
	public LibrosDescarga buscarPorDescarga(int idLibro) {
		return lideRepo.findById(idLibro).orElse(null);
	}

	@Override
	public List<LibrosDescarga> buscarTodosLasDescargas(int idLibro) {
		return null;
		// return lideRepo.buscarTodosPorLibro(idLibro);
	}
}
