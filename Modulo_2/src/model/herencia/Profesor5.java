package model.herencia;

public class Profesor5 extends Persona5{
	private String materia;
	
	public Profesor5() {
		
	}
	
	public Profesor5(String nom, String apellido, int edad, String dni, String domicilio, String materia) {
	super (nom, apellido, edad, dni, domicilio);
	this.materia = materia;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	
	public void mostrar() {
		System.out.println("Informacion del Profesor/a: "+ super.getNombre());
		System.out.println("El apellido es: " + super.getApellido());
		System.out.println("Su edad es: "+ super.getEdad());
		System.out.println("Su DNI es :"+ super.getDni());
		System.out.println("Su domicilio es: " + super.getDomicilio());
		System.out.println("Su materia es: " + this.materia);
	}

}
