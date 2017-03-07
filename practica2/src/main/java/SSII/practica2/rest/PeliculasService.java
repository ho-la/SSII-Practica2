package SSII.practica2.rest;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import SSII.practica2.model.Peliculas;
import SSII.practica2.model.PeliculasRepository;

public class PeliculasService {
	@Autowired
	private PeliculasRepository peliculasRepository;
	
	// Getters y setters ...
	public List<Peliculas> getAllPeliculas() {
		return (List<Peliculas>) peliculasRepository.findAll();
	}
	public Peliculas getPeliculaById(long id) {
		return peliculasRepository.findOne(id);
	}
	public Peliculas getPeliculaByTitulo(String titulo) {
		return peliculasRepository.findByTitulo(titulo);
	}
	public List<Peliculas> getPeliculasPorPais(String pais) {
		return (List<Peliculas>) peliculasRepository.findByPais(pais);
	}
	public List<Peliculas> getPeliculasPorAnio(int anio) {
		return (List<Peliculas>) peliculasRepository.findByAnio(anio);
	}
	public List<Peliculas> getPeliculasPorNombreDelDirector(String nombreDirector) {
		return (List<Peliculas>) peliculasRepository.findByNombreDelDirector(nombreDirector);
	}
	public List<Peliculas> getPeliculasPorEtiquetas(List<String> tags) {
		return (List<Peliculas>) peliculasRepository.findByEtiquetas(tags);
	}
}
