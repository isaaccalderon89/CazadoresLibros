package com.edix.tfg.cazadoresLibros.Dao;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edix.tfg.cazadoresLibros.beans.Libro;
import com.edix.tfg.cazadoresLibros.repository.LibroRepository;

@Repository
public class LibroDaoImplMy8 implements LibroDao{
	
	@Autowired
	LibroRepository lrepo;

	// Método que busca un libro por su id
	@Override
	public Libro buscarUno(int idLibro) {
		return lrepo.findById(idLibro).orElse(null);
	}
	
	// Método que lista todos los libros
	@Override
	public List<Libro> buscarTodos() {
		return lrepo.findAll();
	}

	// Método que permite dar de alta un nuevo libro
	@Override
	public int altaLibro(Libro libro) {
		int filas =0;
		try {
			lrepo.save(libro);
			filas=1;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return filas;
	}

	// Método que permite eliminar un libro
	@Override
	public int eliminarLibro(int idLibro) {
		int filas = 0;
		try {
			lrepo.deleteById(idLibro);
			filas=1;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return filas;
	}

	// Método que permite modificar un libro
	@SuppressWarnings("deprecation")
	@Override
	public int modificarLibro(Libro libro) {
		int filas = 0;
		Libro l1 = null;
		try {
			l1 = lrepo.getOne(libro.getIdLibro());
			l1 = libro;
			lrepo.save(l1);
			filas=1;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return filas;
	}

	// Método que permite buscar un libro por su nombre
	@Override
	public List<Libro> buscadorLibros(String nombre) {
		return lrepo.buscadorLibros(nombre);
	}

	// Método que filtra alfabética el nombre de los libros
	@Override
	public List<Libro> filtroAlfabetico(String nombre) {
		return lrepo.filtroAlfabetico(nombre);
	}

	// Método que filtra el precio del libro por su id
	@Override
	public BigDecimal precioLibro(int idLibro) {
		try {
			return this.lrepo.precioLibro(idLibro);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}	

}
