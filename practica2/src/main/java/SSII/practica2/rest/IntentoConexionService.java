package SSII.practica2.rest;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import SSII.practica2.model.IntentoConexion;
import SSII.practica2.model.IntentoConexionRepository;

public class IntentoConexionService {
	@Autowired
	private IntentoConexionRepository intentoConexionRepository;
	

	public List<IntentoConexion> getAllIntentoConexion() {
		return (List<IntentoConexion>) intentoConexionRepository.findAll();
	}
	public IntentoConexion getIntentoConexionPorId(long id) {
		return intentoConexionRepository.findById(id);
	}
	public List<IntentoConexion> getIntentoConexionPorFecha(Date fecha) {
		return (List<IntentoConexion>) intentoConexionRepository.findByFecha(fecha);
	}
	public List<IntentoConexion> getIntentoConexionPorHora(int hora) {
		return (List<IntentoConexion>) intentoConexionRepository.findByHora(hora);
	}
	public List<IntentoConexion> getIntentoConexionPorIp(String ip) {
		return (List<IntentoConexion>) intentoConexionRepository.findByIp(ip);
	}
	public List<IntentoConexion> getIntentoConexionPorNombreUsuario(String nombreUsuario) {
		return (List<IntentoConexion>) intentoConexionRepository.findByNombreDeUsuario(nombreUsuario);
	}
	public List<IntentoConexion> getIntentoConexionPorResultado(boolean resultado) {
		return (List<IntentoConexion>) intentoConexionRepository.findByResultado(resultado);
	}
}
