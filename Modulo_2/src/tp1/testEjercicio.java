package tp1;
import java.util.ArrayList;
public class testEjercicio {

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
