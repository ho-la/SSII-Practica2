package SSII.practica2.rest;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SSII.practica2.model.Usuario;
import SSII.practica2.model.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepository userRepository;
	
	// Getters y setters ...
	public List<Usuario> getUsuarios() {
		return (List<Usuario>) userRepository.findAll();
	}
	public Usuario getUsuariosById(long id) {
		return userRepository.findById(id);
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
