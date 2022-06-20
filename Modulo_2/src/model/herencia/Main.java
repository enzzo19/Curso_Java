package model.herencia;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona mi_persona = new Persona("Enzo", "Juarez", 21, "12345678");
		
		mi_persona.mostrar();
		
		System.out.println();
		Alumno mi_alumno = new Alumno("Juan", "Perez", 25, "87654321", "Escuela Urquiza");
		
		mi_alumno.generarMaterias();
		mi_alumno.generarNotas();
		
		System.out.println();
		
		mi_alumno.mostarNotas();

	}

}
