package com.edix.tfg.cazadoresLibros.beans;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.Objects;


/**
 * The persistent class for the tarjetas database table.
 * 
 */
@Entity
@Table(name="tarjetas")
@NamedQuery(name="Tarjeta.findAll", query="SELECT t FROM Tarjeta t")
public class Tarjeta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_tarjeta")
	private int idTarjeta;

	@Temporal(TemporalType.DATE)
	private Date caducidad;

	private int cvv;

	@Column(name="nombre_titular")
	private String nombreTitular;

	private String numeracion;

	public Tarjeta() {
	}
	

	public Tarjeta(int idTarjeta, Date caducidad, int cvv, String nombreTitular, String numeracion) {
		super();
		this.idTarjeta = idTarjeta;
		this.caducidad = caducidad;
		this.cvv = cvv;
		this.nombreTitular = nombreTitular;
		this.numeracion = numeracion;
	}


	public int getIdTarjeta() {
		return this.idTarjeta;
	}

	public void setIdTarjeta(int idTarjeta) {
		this.idTarjeta = idTarjeta;
	}

	public Date getCaducidad() {
		return this.caducidad;
	}

	public void setCaducidad(Date caducidad) {
		this.caducidad = caducidad;
	}

	public int getCvv() {
		return this.cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public String getNombreTitular() {
		return this.nombreTitular;
	}

	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}

	public String getNumeracion() {
		return this.numeracion;
	}

	public void setNumeracion(String numeracion) {
		this.numeracion = numeracion;
	}


	@Override
	public int hashCode() {
		return Objects.hash(caducidad, cvv, idTarjeta, nombreTitular, numeracion);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarjeta other = (Tarjeta) obj;
		return Objects.equals(caducidad, other.caducidad) && cvv == other.cvv && idTarjeta == other.idTarjeta
				&& Objects.equals(nombreTitular, other.nombreTitular) && Objects.equals(numeracion, other.numeracion);
	}


	@Override
	public String toString() {
		return "Tarjeta [idTarjeta=" + idTarjeta + ", caducidad=" + caducidad + ", cvv=" + cvv + ", nombreTitular="
				+ nombreTitular + ", numeracion=" + numeracion + "]";
	}
	

}