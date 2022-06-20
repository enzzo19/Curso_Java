package trabajo_pratico;
import java.util.Scanner;

public class ejercicio_3_Scanner_CM4 {
	
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		double precio_total;
		System.out.println("Ingresa el valor del precio X:");
		double precio = teclado.nextDouble();
		precio_total = precio * 1.105;
		System.out.println("El precio total del producto X es: $" + precio_total);
	}

}
