package tp3;
import java.util.ArrayList;

public class main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Figura> mis_figuras = new ArrayList<Figura>();
		
		Circulo mi_circulo = new Circulo(5);
		Cuadrado mi_cuadrado = new Cuadrado(5, 5);
		
		mis_figuras.add(mi_circulo);
		mis_figuras.add(mi_cuadrado);
		
		
		for (int i = 0; i < mis_figuras.size(); i++) {
			System.out.println("El " + mis_figuras.get(i).getNombre() + " tiene un area de :" + mis_figuras.get(i).getArea());
		}

		
		System.out.println(mi_circulo);
	}

}
