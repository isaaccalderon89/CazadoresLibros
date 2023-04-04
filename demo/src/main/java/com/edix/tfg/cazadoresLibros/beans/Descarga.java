package com.edix.tfg.cazadoresLibros.beans;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.Objects;


/**
 * The persistent class for the descargas database table.
 * 
 */
@Entity
@Table(name="descargas")
@NamedQuery(name="Descarga.findAll", query="SELECT d FROM Descarga d")
public class Descarga implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_descarga")
	private int idDescarga;

	private String estado;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;

	//uni-directional many-to-one association to Tarjeta
	@ManyToOne
	@JoinColumn(name="id_tarjeta")
	private Tarjeta tarjeta;

	//uni-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="id_usuario")
	private Usuario usuario;

	public Descarga() {
	}

	public Descarga(int idDescarga, String estado, Date fecha, Tarjeta tarjeta, Usuario usuario) {
		super();
		this.idDescarga = idDescarga;
		this.estado = estado;
		this.fecha = fecha;
		this.tarjeta = tarjeta;
		this.usuario = usuario;
	}

	public int getIdDescarga() {
		return this.idDescarga;
	}

	public void setIdDescarga(int idDescarga) {
		this.idDescarga = idDescarga;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Tarjeta getTarjeta() {
		return this.tarjeta;
	}

	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(estado, fecha, idDescarga, tarjeta, usuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Descarga other = (Descarga) obj;
		return Objects.equals(estado, other.estado) && Objects.equals(fecha, other.fecha)
				&& idDescarga == other.idDescarga && Objects.equals(tarjeta, other.tarjeta)
				&& Objects.equals(usuario, other.usuario);
	}

	@Override
	public String toString() {
		return "Descarga [idDescarga=" + idDescarga + ", estado=" + estado + ", fecha=" + fecha + ", tarjeta=" + tarjeta
				+ ", usuario=" + usuario + "]";
	}
	

}