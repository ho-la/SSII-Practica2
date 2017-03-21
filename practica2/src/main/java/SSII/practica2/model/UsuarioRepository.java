package SSII.practica2.model;

import java.util.Date;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario,Long>{

	Usuario findByNombreDeUsuario(String nombreDeUsuario);
	//por contrasena
	Usuario findByNombre(String nombre);
	Usuario findByApellidos(String apellidos);
	Usuario findByCorreoElectronico(String correo);
	List<Usuario> findByFechaDeNacimiento(Date fecha);
	List<Usuario> findByPais(String pais);
	List<Usuario> findByCiudadDeResidencia(String ciudad);
}