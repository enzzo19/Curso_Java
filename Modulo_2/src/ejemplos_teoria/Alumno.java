package ejemplos_teoria;

public class Alumno extends Persona{
	
	// Atributos
	private String colegio;
	private int curso;
	private int materias;
	
	public Alumno(String nombre, String apellido, Mascota mascota, String colegio, int curso) {
		super(nombre, apellido, mascota);
		this.colegio = colegio;
		this.curso = curso;
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

	public int getMaterias() {
		return materias;
	}

	public void setMaterias(int materias) {
		this.materias = materias;
	}
	
	public void mostrar() {
		System.out.println("Informa de Datos del Alumno/a: "+ super.getNombre());
		System.out.println("El apellido es: " + super.getApellido());
		System.out.println("Su edad es: "+ super.getEdad()); 
		System.out.println("Su DNI es :"+ super.getDni());
		System.out.println("El colegio es: " + this.colegio);
		System.out.println("El curso es: " + this.curso);
	}
	
	

} 
