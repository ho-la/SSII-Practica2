package ssii.practica2.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ssii.practica2.model.IntentoConexion;
import ssii.practica2.service.IntentoConexionService;


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
