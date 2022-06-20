package model.herencia;


public class Alumno5 extends Persona5{
	private String colegio;
	private int curso;
	private String division;
	
	
	public Alumno5() {
		
	}
	
	public Alumno5(String nom, String apellido, int edad, String dni, String domicilio, String colegio, int curso, String division) {
		super (nom, apellido, edad, dni, domicilio);
		this.colegio = colegio;
		this.curso = curso;
		this.division = division;
		
	}

	public String getColegio() {
		return colegio;
	}

	public void setColegio(String colegio) {
		this.colegio = colegio;
	}


	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public void mostrar() {
		System.out.println("Informacion del alumno/a: "+ super.getNombre());
		System.out.println("El apellido es: " + super.getApellido());
		System.out.println("Su edad es: "+ super.getEdad());
		System.out.println("Su DNI es :"+ super.getDni());
		System.out.println("Su domicilio es: " + super.getDomicilio());
		System.out.println("Su colegio es: " + this.colegio);
		System.out.println("Su curso es: " + this.curso + "° " + this.division);
	}
	
	

}
