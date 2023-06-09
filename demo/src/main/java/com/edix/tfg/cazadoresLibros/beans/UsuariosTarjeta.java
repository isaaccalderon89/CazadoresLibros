package com.edix.tfg.cazadoresLibros.beans;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.*;


/**
 * The persistent class for the usuarios_tarjetas database table.
 * 
 */
@Entity
@Table(name="usuarios_tarjetas")
@NamedQuery(name="UsuariosTarjeta.findAll", query="SELECT u FROM UsuariosTarjeta u")
public class UsuariosTarjeta implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UsuariosTarjetaPK id;

	public UsuariosTarjeta() {
		
	}
	

	public UsuariosTarjeta(UsuariosTarjetaPK id) {
		super();
		this.id = id;
	}


	public UsuariosTarjetaPK getId() {
		return this.id;
	}

	public void setId(UsuariosTarjetaPK id) {
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
		UsuariosTarjeta other = (UsuariosTarjeta) obj;
		return Objects.equals(id, other.id);
	}


	@Override
	public String toString() {
		return "UsuariosTarjeta [id=" + id + "]";
	}

}