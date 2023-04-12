package com.edix.tfg.cazadoresLibros.Dao;

import java.math.BigDecimal;
import java.util.List;

import com.edix.tfg.cazadoresLibros.beans.Libro;

public interface LibroDao {

	Libro buscarUno(int idLibro);
	List<Libro> buscarTodos();
	int altaLibro(Libro libro);
	int eliminarLibro(int idLibro);
	int modificarLibro(Libro libro);
	List<Libro> buscadorLibros(String nombre);
	List<Libro> filtroAlfabetico(String nombre);
	BigDecimal precioLibro(int idLibro);
}
