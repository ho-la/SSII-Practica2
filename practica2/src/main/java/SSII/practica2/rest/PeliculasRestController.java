package SSII.practica2.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import SSII.practica2.model.Peliculas;


@RestController
public class PeliculasRestController {
	@Autowired
	private PeliculasService peliculaService;

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public List<Peliculas> getUsuarios() {
		return peliculaService.getAllPeliculas();
	}

	@RequestMapping(value = "/user/{index}", method = RequestMethod.GET)
	public Peliculas getPelicula(@PathVariable("index") int index) {
		return peliculaService.getPeliculaById(index);
	}
}
