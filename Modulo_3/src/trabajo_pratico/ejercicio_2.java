package trabajo_pratico;
import java.io.InputStream;

public class ejercicio_2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		int num = 0;
		
		while((num < 47) ||(num > 58)) {
			if (num != 13 && num != 10) {
				System.out.println("Ingresa un valor entero: ");
			}
			num  = System.in.read();
			//System.out.println("Valor ingresado: " + num);
		}
		System.out.println("El numerso ingresado es: " + (char) num);
	}

}
