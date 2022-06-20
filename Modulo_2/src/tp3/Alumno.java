package tp3;
import java.util.ArrayList;
public class Alumno extends Persona{
	
	// Atributos
	private String colegio;
	private int curso;
	private int materias;
	private ArrayList <Integer> notas = new ArrayList<Integer>();
	
	
	public Alumno(String nombre, String apellido, String colegio, int curso) {
		super(nombre, apellido);
		this.colegio = colegio;
		this.curso = curso;
	}

	public String getColegio() {
		return colegio;
	}

	public void setColegio(String colegio) {
		this.colegio = colegio;
	}

	public ArrayList<Integer> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Integer> notas) {
		this.notas = notas;
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
	
	public void generar_notas(){
        for(int i = 0; i < 3; i ++){
        	int rand = (int)(Math.random()*10 + 1);
        	this.notas.add(rand);
        }
    }
	
	public void mostrarNotas() {
		System.out.println("Las notas del alumno: " + super.getNombre() + " son: ");
		System.out.println("Matematicas: " + this.notas.get(0));
		System.out.println("Lengua: " + this.notas.get(1));
		System.out.println("Historia: " + this.notas.get(2));
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
