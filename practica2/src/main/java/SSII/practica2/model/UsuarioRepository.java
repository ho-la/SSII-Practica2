package SSII.practica2.model;

import java.util.Date;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario,Long>{

	Usuario findByNombreDeUsuario(String nombreDeUsuario);
	//por contraseña
	Usuario findByNombre(String nombre);
	Usuario findByApellido(String apellido);
	Usuario findByCorreoElectronico(String correo);
	List<Usuario> findByFechaDeNacimiento(Date fecha);
	List<Usuario> findByPais(String pais);
	List<Usuario> findByCiudadDeResidencia(String ciudad);
}