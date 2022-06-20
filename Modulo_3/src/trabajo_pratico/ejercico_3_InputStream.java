package trabajo_pratico;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class ejercico_3_InputStream {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		InputStreamReader entrada = new InputStreamReader(System.in);
		BufferedReader teclado = new BufferedReader(entrada);
		double precio;
		System.out.println("Ingrese el precio del producto x: ");
		String p = teclado.readLine();
		precio = 1.105 * Double.parseDouble(p);
		System.out.println("El precio final de tu producto es: " + precio);
	}

}
