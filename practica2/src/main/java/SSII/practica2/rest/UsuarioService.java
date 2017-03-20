package SSII.practica2.rest;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import SSII.practica2.model.Usuario;
import SSII.practica2.model.UsuarioRepository;

public class UsuarioService {
	@Autowired
	private UsuarioRepository userRepository;
	
	// Getters y setters ...
	public List<Usuario> getTodosLosUsuarios() {
		return (List<Usuario>) userRepository.findAll();
	}
	public Usuario getUsuarioPorId(long id) {
		return userRepository.findOne(id);
	}
	public Usuario getUsuarioPorNombreDeUsuario(String nombre) {
		return userRepository.findByNombreDeUsuario(nombre);
	}
	public Usuario getUsuarioPorNombre(String nombre) {
		return userRepository.findByNombre(nombre);
	}
	public Usuario getUsuarioPorApellidos(String apellidos) {
		return userRepository.findByApellidos(apellidos);
	}
	public Usuario getUsuarioPorCorreo(String correo) {
		return userRepository.findByCorreoElectronico(correo);
	}public List<Usuario> getUsuariosPorFecha(Date fecha) {
		return (List<Usuario>) userRepository.findByFechaDeNacimiento(fecha);
	}
	public List<Usuario> getUsuariosPorPais(String pais) {
		return (List<Usuario>) userRepository.findByPais(pais);
	}
	public List<Usuario> getUsuariosPorCiudadDeResidencia(String ciudad) {
		return (List<Usuario>) userRepository.findByCiudadDeResidencia(ciudad);
	}
}
