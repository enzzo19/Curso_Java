package tp2;

public class Empleado {
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
		private int año_curso;
		private double sueldo_basico;
		
		
		// Crear los constructores
		// CONSTRUCTOR POR DEFECTO
		public Empleado() {
			
		}
		//CONSTRUCTOR DE COPIA
		public Empleado(Empleado empleado) {
			this.nombre = empleado.nombre;
			this.apellido = empleado.apellido;
			this.edad = empleado.edad;
			this.sueldo_basico = empleado.sueldo_basico;
		}
		//CONSTRUCTOR NORMAL (POR PARAMETROS)
		
		// CONSTRUCTOR NOMRAL 2
		public Empleado(String nom, String apellido, int edad, String dni, double sueldo_basico) {
			this.nombre = nom;
			this.apellido = apellido;
			this.edad = edad;
			this.dni = dni;
			this.sueldo_basico = sueldo_basico;
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
		public double getSueldo_basico() {
			return sueldo_basico;
		}
		public void setSueldo_basico(double sueldo_basico) {
			this.sueldo_basico = sueldo_basico;
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
		
		public String ToString() {
			return "Nombre: " + this.nombre + "\nApellido: " + this.apellido;
		}
		
		
		public void verEmpleado() {
			System.out.println("Los datos del Empleado son: ");
			System.out.println("El nombre es: " + this.nombre);
			System.out.println("El apellido es: "+ this.apellido);
			System.out.println("El sueldo basico es de : $"+ this.sueldo_basico);
		} 
		
		public double calculaSueldo(int horas) {
			return this.sueldo_basico * horas;
		}

}
