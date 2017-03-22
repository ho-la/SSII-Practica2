package SSII.practica2.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ReproduccionRepository extends CrudRepository<Reproduccion,Long>{


	Reproduccion findById(long id);
	List<Reproduccion> findAll();
	List<Reproduccion> findByFecha(Date fecha);
	List<Reproduccion> findByHora(int hora); 
	List<Reproduccion> findByUsuario(String usuario);
	List<Reproduccion> findByPelicula(String pelicula);
}
