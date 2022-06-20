package model.herencia;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Alumno5 mi_alumno = new Alumno5("Enzo", "Juarez", 21, "12345678", "B° Autodromo", "Tecnica 2", 3, "A");
		
		mi_alumno.mostrar();
		System.out.println();
		
		Profesor5 mi_profesor = new Profesor5("Jose", "Perez", 25, "87654321", "B° Soledad", "Matematicas");
		
		mi_profesor.mostrar();
	}

}
