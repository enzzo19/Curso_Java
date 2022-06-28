package cinemar;


public class Persona {

	//Atributos
	private String nombre;
	private String apellido;
	
	//Constructores
	//Constructor por defecto
	public Persona() {
		
	}
	
	//Constructor de copia
	public Persona(Persona persona) {
		this.nombre = persona.nombre;
		this.apellido = persona.apellido;
	}
	
	//Constrcutor Normal
	public Persona(String nombre,String apellido){
		this.nombre=nombre;
		this.apellido=apellido;
	}

}
