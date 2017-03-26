package ssii.practica2.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import ssii.practica2.model.Reproduccion;

public interface ReproduccionRepository extends CrudRepository<Reproduccion,Long>{


	Reproduccion findById(long id);
	List<Reproduccion> findAll();
	List<Reproduccion> findByFecha(Date fecha);
	List<Reproduccion> findByHora(int hora); 
	List<Reproduccion> findByUsuario(String usuario);
	List<Reproduccion> findByPelicula(String pelicula);
}
