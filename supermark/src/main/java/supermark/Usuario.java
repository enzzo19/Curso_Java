package supermark;

import java.util.Date;

public class Usuario {
	private int id_usuario;
	private String nombre;
	private boolean esAdministrador;
	private String clave;
	
	public Usuario() {
		
	}
	
	public Usuario(int id_usuario, String nombre, boolean esAdministrador, String clave) {
		super();
		this.id_usuario = id_usuario;
		this.nombre = nombre;
		this.esAdministrador = esAdministrador;
		this.clave = clave;
	}
	
	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public boolean isEsAdministrador() {
		return esAdministrador;
	}

	public void setEsAdministrador(boolean esAdministrador) {
		this.esAdministrador = esAdministrador;
	}

	
	
}
	