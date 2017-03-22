package SSII.practica2.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import SSII.practica2.model.IntentoConexion;


@RestController
public class IntentoConexionRestController {
	@Autowired
	private IntentoConexionService intentoConexionService;

	@RequestMapping(value = "/intentoConexion", method = RequestMethod.GET)
	public List<IntentoConexion> getUsuarios() {
		return intentoConexionService.getAllIntentoConexion();
	}

	@RequestMapping(value = "/intentoConexion/{index}", method = RequestMethod.GET)
	public IntentoConexion getPelicula(@PathVariable("index") int index) {
		return intentoConexionService.getIntentoConexionPorId(index);
	}
}
