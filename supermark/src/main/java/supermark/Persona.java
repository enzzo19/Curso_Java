package supermark;


public class Persona {

	//Atributos
	private String nombre;
	private String apellido;
	private int edad;
	
	//Constructores
	//Constructor por defecto
	public Persona() {
		
	}
	
	//Constructor de copia
	public Persona(Persona persona) {
		this.nombre = persona.nombre;
		this.apellido = persona.apellido;
		this.edad = persona.edad;
	}
	
	//Constrcutor Normal
	public Persona(String nombre,String apellido, int edad){
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad = edad;
	}

}
