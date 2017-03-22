package SSII.practica2.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface IntentoConexionRepository extends CrudRepository<IntentoConexion,Long>{
	List<IntentoConexion> findAll();
	IntentoConexion findById(long id);
	List<IntentoConexion> findByFecha(Date fecha);
	List<IntentoConexion> findByHora(int hora);
	List<IntentoConexion> findByIp(String ip);
	List<IntentoConexion> findByNombreDeUsuario(String nombreDeUsuario);
	List<IntentoConexion> findByResultado(boolean resultado);
	
}
