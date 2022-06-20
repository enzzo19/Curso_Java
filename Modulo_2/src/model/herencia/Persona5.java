package model.herencia;

public class Persona5 {
	// ATRIBUTOS
	private String nombre;
	private String apellido;
	private int edad;
	private String dni;
	private String domicilio;

	
	
	// Crear los constructores
	// CONSTRUCTOR POR DEFECTO
	public Persona5() {
		
	}
	//CONSTRUCTOR DE COPIA
	public Persona5(Persona5 persona) {
		this.nombre = persona.nombre;
		this.apellido = persona.apellido;
		this.edad = persona.edad;
	}
	//CONSTRUCTOR NORMAL (POR PARAMETROS)
	
	public Persona5(String nom, String apellido, int edad, String dni, String domicilio) {
		this.nombre = nom;
		this.apellido = apellido;
		this.edad = edad;
		this.dni = dni;
		this.domicilio = domicilio;
		
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	
	//Metodos de mi clase
	public void mostrar() {
		System.out.println("Informa de Datos de la Persona: "+ this.nombre);
		System.out.println("El apellido es: " + this.apellido);
		System.out.println("Su edad es: "+ this.edad);
		System.out.println("Su DNI es :"+ this.dni);
		System.out.println("Su domicilio es: " + this.domicilio);
	}
	
	
	
}

