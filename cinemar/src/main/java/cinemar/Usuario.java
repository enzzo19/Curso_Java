package cinemar;

import java.util.Date;

public class Usuario {
	private int id_usuario;
	private String nombre;
	private String apellido;
	private boolean esAdministrador;
	private String email;
	private Date fecha_nacimiento;
	private String dni;
	
	public Usuario() {
		
	}
	
	public Usuario(int id_usuario, String nombre, String apellido, boolean esAdministrador, String email,
			Date fecha_nacimiento, String dni) {
		super();
		this.id_usuario = id_usuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.esAdministrador = esAdministrador;
		this.email = email;
		this.fecha_nacimiento = fecha_nacimiento;
		this.dni = dni;
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public boolean isEsAdministrador() {
		return esAdministrador;
	}

	public void setEsAdministrador(boolean esAdministrador) {
		this.esAdministrador = esAdministrador;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Usuario [id_usuario=" + id_usuario + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", esAdministrador=" + esAdministrador + ", email=" + email + ", fecha_nacimiento=" + fecha_nacimiento
				+ ", dni=" + dni + "]";
	}
	
	public static void main(String[] args) {
		Date fechaDeNacimiento= new Date(122, 6,23, 2, 30, 30);
		Usuario persona1 = new Usuario(01, "Mario", "Gutierrez",false, "mariogutierrez@gmail.com", fechaDeNacimiento, "30222380");
		System.out.println(persona1.toString());
	}
	
}
