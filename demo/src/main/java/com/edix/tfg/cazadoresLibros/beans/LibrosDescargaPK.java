package com.edix.tfg.cazadoresLibros.beans;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the libros_descarga database table.
 * 
 */
@Embeddable
public class LibrosDescargaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_libro", insertable=false, updatable=false)
	private int idLibro;

	@Column(name="id_descarga", insertable=false, updatable=false)
	private int idDescarga;

	public LibrosDescargaPK() {
	}
	
	public LibrosDescargaPK(int idLibro, int idDescarga) {
		super();
		this.idLibro = idLibro;
		this.idDescarga = idDescarga;
	}

	public int getIdLibro() {
		return this.idLibro;
	}
	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}
	public int getIdDescarga() {
		return this.idDescarga;
	}
	public void setIdDescarga(int idDescarga) {
		this.idDescarga = idDescarga;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof LibrosDescargaPK)) {
			return false;
		}
		LibrosDescargaPK castOther = (LibrosDescargaPK)other;
		return 
			(this.idLibro == castOther.idLibro)
			&& (this.idDescarga == castOther.idDescarga);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idLibro;
		hash = hash * prime + this.idDescarga;
		
		return hash;
	}

	@Override
	public String toString() {
		return "LibrosDescargaPK [idLibro=" + idLibro + ", idDescarga=" + idDescarga + "]";
	}
	
	
}