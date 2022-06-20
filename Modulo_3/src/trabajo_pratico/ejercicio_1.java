package trabajo_pratico;
import java.io.ByteArrayInputStream;


public class ejercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte [] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		ByteArrayInputStream flujo = new ByteArrayInputStream(array);
		while(flujo.available() != 0) {
			byte numero = (byte) flujo.read();
			System.out.print(numero + ",");
		}
	}

}
