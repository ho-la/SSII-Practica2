package ssii.practica2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ssii.practica2.model.Usuario;
import ssii.practica2.repository.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepository userRepository;
	
	// Getters y setters ...
	public List<Usuario> getUsuarios() {
		return (List<Usuario>) userRepository.findAll();
	}
	public Usuario getUsuariosById(int id) {
		return userRepository.findById(id);
	}
	public Usuario getUsuarioByAlias(String nombre) {
		return userRepository.findByAlias(nombre);
	}
	public Usuario getUsuarioPorNombre(String nombre) {
		return userRepository.findByNombre(nombre);
	}
	public Usuario getUsuarioPorApellido(String apellidos) {
		return userRepository.findByApellido(apellidos);
	}
	public Usuario getUsuarioPorCorreo(String correo) {
		return userRepository.findByCorreo(correo);
	}
	public List<Usuario> getUsuariosPorFechaNacimiento(String fecha) {
		return (List<Usuario>) userRepository.findByFechaNacimiento(fecha);
	}
	public List<Usuario> getUsuariosPorPais(String pais) {
		return (List<Usuario>) userRepository.findByPais(pais);
	}
	public List<Usuario> getUsuariosPorCiudad(String ciudad) {
		return (List<Usuario>) userRepository.findByCiudad(ciudad);
	}
}
