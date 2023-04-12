package com.edix.tfg.cazadoresLibros.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edix.tfg.cazadoresLibros.beans.Tarjeta;
import com.edix.tfg.cazadoresLibros.beans.Usuario;
import com.edix.tfg.cazadoresLibros.repository.UsuarioRepository;

@Repository
public class UsuarioDaoImplMy8 implements UsuarioDao {

	@Autowired
	private UsuarioRepository urepo;
	
	// Método para buscar un usuario por su id.
	@Override
	public Usuario buscarUno(int idUsuario) {
		Usuario usuario = new Usuario();
		usuario.setIdUsuario(idUsuario);
		int pos = urepo.findAll().indexOf(usuario);
		if (pos == -1) {
			return null;
		} else {
			return urepo.findById(idUsuario).orElse(null);
		}
	}

	// Método para listar todos los usuarios
	@Override
	public List<Usuario> buscarTodos() {
		return urepo.findAll();
	}

	// Método para dar de alta un usuario
	@Override
	public int altaUsuario(Usuario usuario) {
		int filas =0;
		try {
			urepo.save(usuario);
			filas=1;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return filas;
	}

	// Método para eliminar un usuario por su id
	@Override
	public int eliminarUsuario(int idUsuario) {
		int filas = 0;
		try {
			urepo.deleteById(idUsuario);
			filas=1;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return filas;
	}

	// Método para modificar un usuario
	@Override
	public int modificarUsuario(Usuario usuario) {
		int filas = 0;
		Usuario u1 = null;
		try {
			u1 = urepo.getOne(usuario.getIdUsuario());
			u1 = usuario;
			urepo.save(u1);
			filas=1;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return filas;
	}

}
