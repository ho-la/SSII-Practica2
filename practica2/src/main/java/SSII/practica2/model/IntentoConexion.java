package SSII.practica2.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class IntentoConexion {
	private Date fecha;
	private int hora;
	private String ip;
	private String nombreDeUsuario;
	private boolean resultado;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private long id;
	
	public IntentoConexion(){
		
	}
	public IntentoConexion(Date fecha, int hora, String iP, String nombreDeUsuario, boolean resultado) {
		this.fecha = fecha;
		this.hora = hora;
		this.ip = iP;
		this.nombreDeUsuario = nombreDeUsuario;
		this.resultado = resultado;
		
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getNombreDeUsuario() {
		return nombreDeUsuario;
	}
	public void setNombreDeUsuario(String nombreDeUsuario) {
		this.nombreDeUsuario = nombreDeUsuario;
	}
	public boolean isResultado() {
		return resultado;
	}
	public void setResultado(boolean resultado) {
		this.resultado = resultado;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
}
