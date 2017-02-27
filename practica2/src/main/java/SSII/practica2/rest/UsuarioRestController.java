package SSII.practica2.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import SSII.practica2.model.Usuario;

@RestController
public class UsuarioRestController {
	@Autowired
	private UsuarioService userService;

	@RequestMapping(value = "/peliculas", method = RequestMethod.GET)
	public List<Usuario> getUsuarios() {
		return userService.getTodosLosUsuarios();
	}

	@RequestMapping(value = "/peliculas/{index}", method = RequestMethod.GET)
	public Usuario getPelicula(@PathVariable("index") int index) {
		return userService.getUsuarioPorId(index);
	}
}
