package SSII.practica2.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import SSII.practica2.model.Reproduccion;
@RestController
public class ReproduccionRestController {
	@Autowired
	private ReproduccionService reproduccionService;

	@RequestMapping(value = "/reproduccion", method = RequestMethod.GET)
	public List<Reproduccion> getUsuarios() {
		return reproduccionService.getAllReproduccion();
	}

	@RequestMapping(value = "/reproduccion/{index}", method = RequestMethod.GET)
	public Reproduccion getPelicula(@PathVariable("index") int index) {
		return reproduccionService.getReproduccionById(index);
	}
}
