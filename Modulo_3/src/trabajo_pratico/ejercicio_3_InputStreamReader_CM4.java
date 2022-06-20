package trabajo_pratico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;


public class ejercicio_3_InputStreamReader_CM4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader entrada = new InputStreamReader(System.in);
		BufferedReader teclado = new BufferedReader(entrada);
		double precio_total;
		System.out.println("Ingrese el precio del producto X: ");
		String precio_producto = teclado.readLine();
		precio_total = Double.parseDouble(precio_producto) * 1.105;
		System.out.println("El precio Total del producto es: $"+ precio_total);
	}
}
