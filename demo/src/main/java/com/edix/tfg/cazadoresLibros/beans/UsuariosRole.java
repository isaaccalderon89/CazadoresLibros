package com.edix.tfg.cazadoresLibros.beans;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.*;


/**
 * The persistent class for the usuarios_roles database table.
 * 
 */
@Entity
@Table(name="usuarios_roles")
@NamedQuery(name="UsuariosRole.findAll", query="SELECT u FROM UsuariosRole u")
public class UsuariosRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UsuariosRolePK id;

	public UsuariosRole() {
	}
	

	public UsuariosRole(UsuariosRolePK id) {
		super();
		this.id = id;
	}


	public UsuariosRolePK getId() {
		return this.id;
	}

	public void setId(UsuariosRolePK id) {
		this.id = id;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuariosRole other = (UsuariosRole) obj;
		return Objects.equals(id, other.id);
	}


	@Override
	public String toString() {
		return "UsuariosRole [id=" + id + "]";
	}

}