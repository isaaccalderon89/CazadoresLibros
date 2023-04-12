package com.edix.tfg.cazadoresLibros.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.edix.tfg.cazadoresLibros.beans.Libro;

public interface LibroRepository extends JpaRepository<Libro, Integer>{

	@Query("SELECT l from Libro l where l.nombre LIKE %?1%")
    List<Libro> buscadorLibros(String nombre);
	
	@Query("SELECT l from Libro l order by l.nombre asc")
    List<Libro> filtroAlfabetico(String valor);
	
	@Query("SELECT l.precio from Libro l where l.idLibro = ?1")
    BigDecimal precioLibro(int idLibro);
}
