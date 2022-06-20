package ejemplos_teoria;

public class Persona {
	// ATRIBUTOS
	private String nombre;
	protected String apellido;
	private int edad;
	private String dni;
	private String domicilio;
	private String pais;
	private char sexo;
	private double peso;
	private int estatura;
	private int telefono;
	private String mail;
	private String ocupacion;
	private Mascota mascota;
	
	
	// Crear los constructores
	// CONSTRUCTOR POR DEFECTO
	public Persona() {
		
	}
	//CONSTRUCTOR DE COPIA
	public Persona(Persona persona) {
		this.nombre = persona.nombre;
		this.apellido = persona.apellido;
		this.edad = persona.edad;
	}
	//CONSTRUCTOR NORMAL (POR PARAMETROS)
	
	public Persona(String nom, String apellido, Mascota mascota) {
		this.nombre = nom;
		this.apellido = apellido;
		this.mascota = mascota;
		
	}
	
	// Metodos de Clase
	public Mascota getMascota() {
		return mascota;
	}
	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
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
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getEstatura() {
		return estatura;
	}
	public void setEstatura(int estatura) {
		this.estatura = estatura;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getOcupacion() {
		return ocupacion;
	}
	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}
	//Metodos de mi clase
	public void mostrar() {
		System.out.println("Informa de Datos de la Persona: "+ this.nombre);
		System.out.println("El apellido es: " + this.apellido);
		System.out.println("Su edad es: "+ this.edad);
		System.out.println("Su DNI es :"+ this.dni);
	}
	
	
	
}
