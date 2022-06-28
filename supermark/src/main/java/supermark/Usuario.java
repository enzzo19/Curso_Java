package supermark;

import java.time.LocalDate;

public class Usuario{
	
	
	public enum Rol {
		CLIENTE,ADMINISTRACION;
	}


	private int userid;
	private Rol rol_usuario;
	private String username;
	private String password;
	private String email;
	private LocalDate fecha_alta;
	public static int id_siguiente=1;
	
	public Usuario(String nombre,String password,String rs,String email) {
		
		this.username=nombre;
		this.password=password;
		try {
			this.rol_usuario=Rol.valueOf(rs.toUpperCase());
		} catch (Exception e) {
			System.out.println("debe ingresar un rol valido");
		}
		this.fecha_alta=LocalDate.now();
		this.email=email;
		this.userid=id_siguiente;
		this.id_siguiente++;
	}
	
	
	public int getUserid() {
		return userid;
	}


	public void setUserid(int userid) {
		this.userid = userid;
	}


	public LocalDate getFecha_alta() {
		return fecha_alta;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String nombre) {
		this.username = nombre;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}