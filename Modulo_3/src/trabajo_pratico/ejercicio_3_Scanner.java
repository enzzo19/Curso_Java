package trabajo_pratico;
import java.util.Scanner;
public class ejercicio_3_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double precio;
		System.out.println("Ingrese el precio del producto x: ");
		precio = teclado.nextDouble();
		precio = precio * 1.105;
		System.out.println("El precio final es: " + precio);

	}

}
