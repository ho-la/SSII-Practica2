package ssii.practica2.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import ssii.practica2.model.Peliculas;

public interface PeliculasRepository extends CrudRepository<Peliculas,Long>{

	Peliculas findById(long id);
	List<Peliculas> findAll();
	Peliculas findByTitulo(String titulo);
	List<Peliculas> findByPais(String pais);
	List<Peliculas> findByAnio(int anio);
	List<Peliculas> findByNombreDelDirector(String nombreDelDirector);
}
