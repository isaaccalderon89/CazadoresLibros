package com.edix.tfg.cazadoresLibros.Dao;

import java.util.List;

import com.edix.tfg.cazadoresLibros.beans.LibrosDescarga;

public interface LibrosDescargaDao {

	LibrosDescarga buscarPorDescarga(int idLibro);
	List<LibrosDescarga> buscarTodosLasDescargas(int idLibro);
	
}
