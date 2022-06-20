package tp2;
import java.util.ArrayList;
public class main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Productos mi_producto = new Productos("Sonrisa", 120, 4, true);
		Productos mi_producto2 = new Productos("Jabon", 100, 1, false);
		Productos mi_producto3 = new Productos("Oreo", 110, 3, true);
		Productos mi_producto4 = new Productos("Lapicera", 50, 100, false);
		Productos mi_producto5 = new Productos("Arroz", 150, 2, true);
		
		ArrayList <Productos> mi_lista = new ArrayList<Productos>();
		
		mi_lista.add(mi_producto);
		mi_lista.add(mi_producto2);
		mi_lista.add(mi_producto3);
		mi_lista.add(mi_producto4);
		mi_lista.add(mi_producto5);
		
		double precio_total = 0;
		for (int i = 0; i < mi_lista.size(); i++) {
			
			precio_total += mi_lista.get(i).calcular(5);
			// System.out.println(mi_lista.get(i).calcular(5));
		}
		System.out.println("El total de tu compra es: "+ precio_total);

	}

}
