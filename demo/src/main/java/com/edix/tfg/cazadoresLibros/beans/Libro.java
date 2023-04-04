Lobopackage com.edix.tfg.cazadoresLibros.beans;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;


/**
 * The persistent class for the libros database table.
 * 
 */
@Entity
@Table(name="libros")
@NamedQuery(name="Libro.findAll", query="SELECT l FROM Libro l")
public class Libro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_libro")
	private int idLibro;

	private String autor;

	private String categoria;

	private String descripcion;

	private String editorial;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_lanzamiento")
	private Date fechaLanzamiento;

	private String nombre;

	private BigDecimal precio;

	public Libro() {
	}
	

	public Libro(int idLibro, String autor, String categoria, String descripcion, String editorial,
			Date fechaLanzamiento, String nombre, BigDecimal precio) {
		super();
		this.idLibro = idLibro;
		this.autor = autor;
		this.categoria = categoria;
		this.descripcion = descripcion;
		this.editorial = editorial;
		this.fechaLanzamiento = fechaLanzamiento;
		this.nombre = nombre;
		this.precio = precio;
	}


	public int getIdLibro() {
		return this.idLibro;
	}

	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}

	public String getAutor() {
		return this.autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getCategoria() {
		return this.categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEditorial() {
		return this.editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public Date getFechaLanzamiento() {
		return this.fechaLanzamiento;
	}

	public void setFechaLanzamiento(Date fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getPrecio() {
		return this.precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}


	@Override
	public int hashCode() {
		return Objects.hash(autor, categoria, descripcion, editorial, fechaLanzamiento, idLibro, nombre, precio);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(autor, other.autor) && Objects.equals(categoria, other.categoria)
				&& Objects.equals(descripcion, other.descripcion) && Objects.equals(editorial, other.editorial)
				&& Objects.equals(fechaLanzamiento, other.fechaLanzamiento) && idLibro == other.idLibro
				&& Objects.equals(nombre, other.nombre) && Objects.equals(precio, other.precio);
	}


	@Override
	public String toString() {
		return "Libro [idLibro=" + idLibro + ", autor=" + autor + ", categoria=" + categoria + ", descripcion="
				+ descripcion + ", editorial=" + editorial + ", fechaLanzamiento=" + fechaLanzamiento + ", nombre="
				+ nombre + ", precio=" + precio + "]";
	}
	
	

}