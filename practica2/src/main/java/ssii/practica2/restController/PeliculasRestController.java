package ssii.practica2.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ssii.practica2.model.Peliculas;
import ssii.practica2.service.PeliculasService;


@RestController
public class PeliculasRestController {
	@Autowired
	private PeliculasService peliculaService;

	@RequestMapping(value = "/pelicula", method = RequestMethod.GET)
	public List<Peliculas> getUsuarios() {
		return peliculaService.getAllPeliculas();
	}

	@RequestMapping(value = "/pelicula/{index}", method = RequestMethod.GET)
	public Peliculas getPelicula(@PathVariable("index") int index) {
		return peliculaService.getPeliculaById(index);
	}
}
