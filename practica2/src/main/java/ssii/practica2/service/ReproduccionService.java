package ssii.practica2.service;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ssii.practica2.model.Reproduccion;
import ssii.practica2.repository.ReproduccionRepository;



@Service
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
