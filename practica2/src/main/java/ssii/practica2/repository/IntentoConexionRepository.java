package ssii.practica2.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import ssii.practica2.model.IntentoConexion;


public interface IntentoConexionRepository extends CrudRepository<IntentoConexion,Long>{
	List<IntentoConexion> findAll();
	IntentoConexion findById(long id);
	List<IntentoConexion> findByFecha(Date fecha);
	List<IntentoConexion> findByHora(int hora);
	List<IntentoConexion> findByIp(String ip);
	List<IntentoConexion> findByNombreDeUsuario(String nombreDeUsuario);
	List<IntentoConexion> findByResultado(boolean resultado);
	
}
