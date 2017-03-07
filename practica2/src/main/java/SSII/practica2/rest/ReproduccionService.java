package SSII.practica2.rest;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import SSII.practica2.model.Reproduccion;
import SSII.practica2.model.ReproduccionRepository;

public class ReproduccionService {
	@Autowired
	private ReproduccionRepository reproduccionRepository;
	
	// Getters y setters ...
	public List<Reproduccion> getAllReproduccion() {
		return (List<Reproduccion>) reproduccionRepository.findAll();
	}
	public Reproduccion getReproduccionById(long id) {
		return reproduccionRepository.findOne(id);
	}
	public List<Reproduccion> getReproduccionPorFecha(Date fecha) {
		return (List<Reproduccion>) reproduccionRepository.findByFecha(fecha);
	}
	public List<Reproduccion> getReproduccionPorHora(int hora) {
		return (List<Reproduccion>) reproduccionRepository.findByHora(hora);
	}
	public List<Reproduccion> getReproduccionPorUsuario(String user) {
		return (List<Reproduccion>) reproduccionRepository.findByUsuario(user);
	}
	public List<Reproduccion> getReproduccionPorPelicula(String peli) {
		return (List<Reproduccion>) reproduccionRepository.findByPelicula(peli);
	}
}
