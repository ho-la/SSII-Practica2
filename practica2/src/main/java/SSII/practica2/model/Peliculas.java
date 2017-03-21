package SSII.practica2.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Peliculas {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private long id;
	
	private String titulo;
	private String pais;
	private int anio;
	private String nombreDelDirector;
	private String resumen;
	private String URLTrailer;
	private List<String> etiquetas;
	
	//private List<Reproduccion> reproducciones;
	
	
	public Peliculas(){
		
	}

	public Peliculas(long id,String titulo, String pais, int anio, String nombreDelDirector, String resumen,
			String uRLTrailer, List<String> etiquetas) {
		this.id=id;
		this.titulo = titulo;
		this.pais = pais;
		this.anio = anio;
		this.nombreDelDirector = nombreDelDirector;
		this.resumen = resumen;
		URLTrailer = uRLTrailer;
		this.etiquetas = etiquetas;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getNombreDelDirector() {
		return nombreDelDirector;
	}

	public void setNombreDelDirector(String nombreDelDirector) {
		this.nombreDelDirector = nombreDelDirector;
	}

	public String getResumen() {
		return resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	public String getURLTrailer() {
		return URLTrailer;
	}

	public void setURLTrailer(String uRLTrailer) {
		URLTrailer = uRLTrailer;
	}

	public List<String> getEtiquetas() {
		return etiquetas;
	}

	public void setEtiquetas(List<String> etiquetas) {
		this.etiquetas = etiquetas;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	/*
	 * public List<Reproduccion> getReproducciones() {
		return reproducciones;
	}

	public void setReproducciones(List<Reproduccion> reproducciones) {
		this.reproducciones = reproducciones;
	}
	 */
	
}
