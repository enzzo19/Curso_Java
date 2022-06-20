package model.herencia;
import java.util.ArrayList;
import java.util.Iterator;

public class Alumno extends Persona{
	private String colegio;
	ArrayList <Integer> notas = new ArrayList<Integer>();
	ArrayList <String> materias = new ArrayList<String>();
	
	public Alumno() {
		
	}
	
	public Alumno(String nom, String apellido, int edad, String dni, String colegio) {
		super (nom, apellido, edad, dni);
		this.colegio = colegio;
		
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
	
	public ArrayList<String> getMaterias() {
		return materias;
	}

	public void setMaterias(ArrayList<String> materias) {
		this.materias = materias;
	}

	public void mostrar() {
		System.out.println("Informa del alumno/a: "+ super.getNombre());
		System.out.println("El apellido es: " + super.getApellido());
		System.out.println("Su edad es: "+ super.getEdad());
		System.out.println("Su DNI es :"+ super.getDni());
		System.out.println("Su colegio es: " + this.colegio);
	}
	
	public void generarNotas() {
		for(int i = 0; i < 3; i++) {
			int nota = (int)(Math.random()* 10 + 1);
			notas.add(nota);
		}
	}
	
	public void generarMaterias() {
		materias.add("Matematicas");
		materias.add("Lengua");
		materias.add("Historia");
	}
	
	public void mostarNotas() {
		
		if (notas.size() > 0) {
			System.out.println("Las notas de "+ super.getNombre() + " son : ");
			for(int i = 0; i < notas.size(); i++) {
				System.out.println(materias.get(i) + ": " + notas.get(i) );
			}
		}else {
			System.out.println("Aun no tenemos notas cargadas !!");
		}

	}	

}
