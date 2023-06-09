package com.edix.tfg.cazadoresLibros.beans;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.*;


/**
 * The persistent class for the usuarios database table.
 * 
 */
@Entity
@Table(name="usuarios")
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_usuario")
	private int idUsuario;

	private String apellidos;

	private String contraseña;

	private String email;

	private int enabled;

	private String nombre;

	public Usuario() {
	}
	

	public Usuario(int idUsuario, String apellidos, String contraseña, String email, int enabled, String nombre) {
		super();
		this.idUsuario = idUsuario;
		this.apellidos = apellidos;
		this.contraseña = contraseña;
		this.email = email;
		this.enabled = enabled;
		this.nombre = nombre;
	}


	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getContraseña() {
		return this.contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEnabled() {
		return this.enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public int hashCode() {
		return Objects.hash(apellidos, contraseña, email, enabled, idUsuario, nombre);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(contraseña, other.contraseña)
				&& Objects.equals(email, other.email) && enabled == other.enabled && idUsuario == other.idUsuario
				&& Objects.equals(nombre, other.nombre);
	}


	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", apellidos=" + apellidos + ", contraseña=" + contraseña
				+ ", email=" + email + ", enabled=" + enabled + ", nombre=" + nombre + "]";
	}
	

}