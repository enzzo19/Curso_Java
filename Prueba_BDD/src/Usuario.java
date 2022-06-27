
import java.util.Date;

public class Usuario {
	private Integer id;
	private String nombre;
	private String apellido;
	private  String dni;
	private Date FechaDeNacimiento;
	private String genero;

	public Usuario(Integer id, String nombre, String apellido, String dni, Date fechaDeNacimiento, String genero) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		FechaDeNacimiento = fechaDeNacimiento;
		this.genero = genero;
	}



	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
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


	public String getDni() {
		return dni;
	}



	public void setDni(String dni) {
		this.dni = dni;
	}


	public Date getFechaDeNacimiento() {
		return FechaDeNacimiento;
	}


	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		FechaDeNacimiento = fechaDeNacimiento;
	}


	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni
				+ ", FechaDeNacimiento=" + FechaDeNacimiento + ", genero=" + genero + "]";
	}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date fecha_nac = new Date(121, 4,19, 2, 30, 5);
	
		Usuario mi_usuario = new Usuario(1, "Jose", "Perez", "123456778", fecha_nac, "M");
		
		System.out.println(mi_usuario);
		
	}
		
}