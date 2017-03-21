package SSII.practica2.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String nombreDeUsuario;
	private String contrasena;
	private String nombre;
	private String apellidos;
	private String correoElectronico;
	private Date fechaDeNacimiento;
	private String pais;
	private String ciudadDeResidencia;


	public Usuario(){
		
	}
	public Usuario(long id,String nombreDeUsuario, String contraseña, String nombre, String apellidos, String correoElectronico,
			Date fechaDeNacimiento, String pais, String ciudadDeResidencia) {
		this.id=id;
		this.nombreDeUsuario = nombreDeUsuario;
		this.contrasena = contraseña;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.correoElectronico = correoElectronico;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.pais = pais;
		this.ciudadDeResidencia = ciudadDeResidencia;
	}

	public String getNombreDeUsuario() {
		return nombreDeUsuario;
	}

	public void setNombreDeUsuario(String nombreDeUsuario) {
		this.nombreDeUsuario = nombreDeUsuario;
	}

	public String getContrasena() {
		return contrasena;
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
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getPaıis() {
		return pais;
	}

	public void setPaıis(String pais) {
		this.pais = pais;
	}

	public String getCiudadDeResidencia() {
		return ciudadDeResidencia;
	}

	public void setCiudadDeResidencia(String ciudadDeResidencia) {
		this.ciudadDeResidencia = ciudadDeResidencia;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	
	
}
