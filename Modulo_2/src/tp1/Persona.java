package tp1;
class Persona{
	//Atributos
	private String nombre;
	private String apellido;
	private int dni;
	private String domicilio;
	
	//Constructores
	//Constructor por defecto
	public Persona() {
		
	}
	
	//Constructor de copia
	public Persona(Persona persona) {
		this.nombre = persona.nombre;
		this.apellido = persona.apellido;
		this.dni = persona.dni;
		this.domicilio = persona.apellido;
	}
	
	//Constrcutor Normal
	public Persona(String nombre,String apellido,int dni,String domicilio){
		this.nombre=nombre;
		this.apellido=apellido;
		this.dni=dni;
		this.domicilio=domicilio;
	}
	
	
	//Metodos Getters y Setters
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//Metodos de la clase
	public void Mostar() {
		System.out.println("*************Informacion de la Persona*************");
		System.out.println("El nombre de la Persona es: "+ this.getNombre());
		System.out.println("El apellido de la Persona es: "+ this.getApellido());
		System.out.println("El dni de la Persona es: "+ this.getDni());
		System.out.println("El domicilio de la Persona es: "+ this.getDomicilio());
	}
	
	public static void main(String args[]) {
		Persona persona1 = new Persona("Cristian", "Cruz", 12345678, "3 cerritos 256");
		
		persona1.Mostar();
	}
	
}
