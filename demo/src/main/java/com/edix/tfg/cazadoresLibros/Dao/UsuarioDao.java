package com.edix.tfg.cazadoresLibros.Dao;

import java.util.List;

import com.edix.tfg.cazadoresLibros.beans.Tarjeta;
import com.edix.tfg.cazadoresLibros.beans.Usuario;

public interface UsuarioDao {
	
	Usuario buscarUno(int idUsuario);
	List<Usuario> buscarTodos(); 
	int altaUsuario(Usuario usuario);
	int eliminarUsuario(int idUsuario);
	int modificarUsuario(Usuario usuario);

}
