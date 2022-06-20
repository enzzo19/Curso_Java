package tp2;

public class Persona {
	// ATRIBUTOS
	private String nombre;
	private String apellido;
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
	private String estudios;
	private int a�o_curso;
	
	
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
	public Persona(String nom, String apellido, int edad) {
		this.nombre = nom;
		this.apellido = apellido;
		this.edad = edad;
		
	}
	
	public Persona(int estatura, String nom, String apellido) {
		this.nombre = nom;
		this.apellido = apellido;
		this.estatura = estatura;
		
	}
	
	// CONSTRUCTOR NOMRAL 2
	public Persona(String nom, String apellido, int edad, String dni) {
		this.nombre = nom;
		this.apellido = apellido;
		this.edad = edad;
		this.dni = dni;
		
	}
	
	//Metodos de mi clase
	public void mostrar() {
		System.out.println("Informa de Datos de la Persona: "+ this.nombre);
		System.out.println("El apellido es: " + this.apellido);
		System.out.println("Su edad es: "+ this.edad);
		System.out.println("Su DNI es :"+ this.dni);
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public void setNombre(String name) {
		this.nombre = name;
	}
	
	
	public void setApellido(String Apellido) {
		this.apellido = Apellido;
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
	public String getEstudios() {
		return estudios;
	}
	public void setEstudios(String estudios) {
		this.estudios = estudios;
	}
	public int getAño_curso() {
		return año_curso;
	}
	public void setAño_curso(int año_curso) {
		this.año_curso = año_curso;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	

	// METODO PRINCIPAL
	public static void main(String ags[]) {
		
		
		// Instancio con constructor normal
		Persona persona1 = new Persona("Enzo", "Juarez", 21, "12345678");
		/*
		// Instancion con el constructor copia
		Persona persona2 = new Persona(persona1);
		System.out.println("El nombre es: " + persona2.nombre);
		
		// Instancio con constructor por defecto
		Persona persona3 = new Persona();
		System.out.println("El nombre es: " + persona3.nombre);
		*/
		
		// Tomar un argumento de mi clase
		System.out.println("El nombre es: " + persona1.getNombre());
		
		persona1.setNombre("Juan");
		
		System.out.println("El nombre es: " + persona1.getNombre());
		System.out.println("La Edad es: " + persona1.getEdad());
		
	}
	
}
