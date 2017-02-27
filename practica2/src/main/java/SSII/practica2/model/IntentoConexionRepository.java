package SSII.practica2.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface IntentoConexionRepository extends CrudRepository<IntentoConexion,Long>{
	List<IntentoConexion> findAll();
	List<IntentoConexion> findPorId(long id);
	List<IntentoConexion> findPorFecha(Date fecha);
	List<IntentoConexion> findPorHora(int hora);
	List<IntentoConexion> findPorIp(String ip);
	List<IntentoConexion> findPorNombreDeUsuario(String nombreDeUsuario);
	List<IntentoConexion> findPorResultado(boolean resultado);
	
}
