package com.edix.tfg.cazadoresLibros.beans;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the usuarios_tarjetas database table.
 * 
 */
@Embeddable
public class UsuariosTarjetaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_usuario", insertable=false, updatable=false)
	private int idUsuario;

	@Column(name="id_tarjeta", insertable=false, updatable=false)
	private int idTarjeta;

	public UsuariosTarjetaPK() {
	}
	
	public UsuariosTarjetaPK(int idUsuario, int idTarjeta) {
		super();
		this.idUsuario = idUsuario;
		this.idTarjeta = idTarjeta;
	}

	public int getIdUsuario() {
		return this.idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public int getIdTarjeta() {
		return this.idTarjeta;
	}
	public void setIdTarjeta(int idTarjeta) {
		this.idTarjeta = idTarjeta;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof UsuariosTarjetaPK)) {
			return false;
		}
		UsuariosTarjetaPK castOther = (UsuariosTarjetaPK)other;
		return 
			(this.idUsuario == castOther.idUsuario)
			&& (this.idTarjeta == castOther.idTarjeta);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idUsuario;
		hash = hash * prime + this.idTarjeta;
		
		return hash;
	}

	@Override
	public String toString() {
		return "UsuariosTarjetaPK [idUsuario=" + idUsuario + ", idTarjeta=" + idTarjeta + "]";
	}
	
}