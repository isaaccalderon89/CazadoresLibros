package com.edix.tfg.cazadoresLibros.Dao;

import java.util.List;

import com.edix.tfg.cazadoresLibros.beans.Descarga;

public interface DescargaDao {
	
	/*
	 * A la hora de seleccionar un libro, se habilitará en la parte de descargas,
	 * que visualmente en la web lo denominaremos "Biblioteca", y ahí habrá una lista de
	 * los libros que hayamos descargado.	 * 
	 */
	
	// Método que devuelve una lista de todos los libros descargados
	List<Descarga> findAll();
	
	// Método que devuelve una descarga por su idDescarga 
	Descarga finById(int idDescarga);
	
}
