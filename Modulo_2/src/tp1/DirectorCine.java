package tp1;
import java.util.ArrayList;

public class DirectorCine {
	//Atributos
	private String nombre;
	private String apellido;
	private int edad;
	
	//Constructores
	
	public DirectorCine() {
		
	}
	
	public DirectorCine(DirectorCine dire) {
		this.nombre = dire.nombre;
		this.apellido = dire.apellido;
		this.edad = dire.edad;
	}
	
	public DirectorCine(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	//Metodos
	
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
		
	
	public static void main(String args []) {
		DirectorCine dire1 = new DirectorCine("Pedro", "Gomez", 31);
		DirectorCine dire2 = new DirectorCine("Juan", "Suarez", 55);
		DirectorCine dire3 = new DirectorCine("Elena", "Albucar", 29);
		
		ArrayList <DirectorCine> ListaDirectores= new ArrayList <DirectorCine>();
		
		System.out.println(ListaDirectores);
		
		ListaDirectores.add(dire1);
		ListaDirectores.add(dire2);
		ListaDirectores.add(dire3);
		
		System.out.println(ListaDirectores);
		
		for (int i = 0; i < 3; i++) {
			System.out.println(ListaDirectores.get(i).getNombre());
		}
		
	}
	
}


