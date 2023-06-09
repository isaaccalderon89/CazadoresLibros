package com.edix.tfg.cazadoresLibros.beans;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.*;


/**
 * The persistent class for the libros_descarga database table.
 * 
 */
@Entity
@Table(name="libros_descarga")
@NamedQuery(name="LibrosDescarga.findAll", query="SELECT l FROM LibrosDescarga l")
public class LibrosDescarga implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private LibrosDescargaPK id;

	private float precio;

	//uni-directional many-to-one association to Descarga
	@ManyToOne
	@JoinColumn(name="id_descarga")
	private Descarga descarga;

	//uni-directional many-to-one association to Libro
	@ManyToOne
	@JoinColumn(name="id_libro")
	private Libro libro;

	public LibrosDescarga() {
	}
	

	public LibrosDescarga(LibrosDescargaPK id, float precio, Descarga descarga, Libro libro) {
		super();
		this.id = id;
		this.precio = precio;
		this.descarga = descarga;
		this.libro = libro;
	}


	public LibrosDescargaPK getId() {
		return this.id;
	}

	public void setId(LibrosDescargaPK id) {
		this.id = id;
	}

	public float getPrecio() {
		return this.precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public Descarga getDescarga() {
		return this.descarga;
	}

	public void setDescarga(Descarga descarga) {
		this.descarga = descarga;
	}

	public Libro getLibro() {
		return this.libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}


	@Override
	public int hashCode() {
		return Objects.hash(descarga, id, libro, precio);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LibrosDescarga other = (LibrosDescarga) obj;
		return Objects.equals(descarga, other.descarga) && Objects.equals(id, other.id)
				&& Objects.equals(libro, other.libro)
				&& Float.floatToIntBits(precio) == Float.floatToIntBits(other.precio);
	}


	@Override
	public String toString() {
		return "LibrosDescarga [id=" + id + ", precio=" + precio + ", descarga=" + descarga + ", libro=" + libro + "]";
	}
	

}