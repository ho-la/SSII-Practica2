package ssii.practica2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name="nombre")
	private String nombre;
	@Column(name="apellido")
	private String apellido;
	@Column(name="contrasena")
	private String contrasena;
	@Column(name="alias")
	private String alias;
	@Column(name="correo")
	private String correo;
	@Column(name="fechaNacimiento")
	private String fechaNacimiento;
	@Column(name="pais")
	private String pais;
	@Column(name="ciudad")
	private String ciudad;
	


	public Usuario(){
		
	}
	public Usuario(int id,String nombreUsuario, String contraseña, String nombre, String apellidos, String correoElectronico,
			String fechaNacimiento, String pais, String ciudadDeResidencia) {
		this.id=id;
		this.alias = nombreUsuario;
		this.contrasena = contraseña;
		this.nombre = nombre;
		this.apellido = apellidos;
		this.correo = correoElectronico;
		this.fechaNacimiento = fechaNacimiento;
		this.pais = pais;
		this.ciudad = ciudadDeResidencia;
	}

	public String getNombreDeUsuario() {
		return this.alias;
	}

	public void setNombreDeUsuario(String nombreDeUsuario) {
		this.alias = nombreDeUsuario;
	}

	public String getContrasena() {
		return this.contrasena;
	}

	public void setContrasena(String contraseña) {
		this.contrasena = contraseña;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellido;
	}

	public void setApellidos(String apellidos) {
		this.apellido = apellidos;
	}

	public String getCorreoElectronico() {
		return correo;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correo = correoElectronico;
	}

	public String getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getPaıis() {
		return pais;
	}

	public void setPaıis(String pais) {
		this.pais = pais;
	}

	public String getCiudadDeResidencia() {
		return ciudad;
	}

	public void setCiudadDeResidencia(String ciudadDeResidencia) {
		this.ciudad = ciudadDeResidencia;
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
