package com.edix.tfg.cazadoresLibros.beans;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the usuarios_roles database table.
 * 
 */
@Embeddable
public class UsuariosRolePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_usuario", insertable=false, updatable=false)
	private int idUsuario;

	@Column(name="id_rol", insertable=false, updatable=false)
	private int idRol;

	public UsuariosRolePK() {
	}
	
	public UsuariosRolePK(int idUsuario, int idRol) {
		super();
		this.idUsuario = idUsuario;
		this.idRol = idRol;
	}

	public int getIdUsuario() {
		return this.idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public int getIdRol() {
		return this.idRol;
	}
	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof UsuariosRolePK)) {
			return false;
		}
		UsuariosRolePK castOther = (UsuariosRolePK)other;
		return 
			(this.idUsuario == castOther.idUsuario)
			&& (this.idRol == castOther.idRol);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idUsuario;
		hash = hash * prime + this.idRol;
		
		return hash;
	}

	@Override
	public String toString() {
		return "UsuariosRolePK [idUsuario=" + idUsuario + ", idRol=" + idRol + "]";
	}
	
}