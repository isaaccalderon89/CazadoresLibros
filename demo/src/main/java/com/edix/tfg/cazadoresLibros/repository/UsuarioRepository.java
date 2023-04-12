package com.edix.tfg.cazadoresLibros.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.edix.tfg.cazadoresLibros.beans.Usuario;
import com.edix.tfg.cazadoresLibros.beans.Tarjeta;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

	@Query("select u.tarjetas from Usuario u where u.email=?1")
	List<Tarjeta> tarjetaUsuario(String email);
}
