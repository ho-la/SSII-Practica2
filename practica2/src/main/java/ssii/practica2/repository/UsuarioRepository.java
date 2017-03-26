package ssii.practica2.repository;

import java.util.List;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import ssii.practica2.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario,Long>{
	
	Usuario findById(long id);
	List<Usuario> findAll();
	Usuario findByAlias(String alia);
	Usuario findByNombre(String nombre);
	Usuario findByApellido(String apellidos);
	Usuario findByCorreo(String correo);
	List<Usuario> findByFechaNacimiento(String fecha);
	List<Usuario> findByPais(String pais);
	List<Usuario> findByCiudad(String ciudad);
}