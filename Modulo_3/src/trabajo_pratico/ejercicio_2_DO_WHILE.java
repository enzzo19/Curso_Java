// Echo por Naomi 
package trabajo_pratico;
import java.io.InputStream;

public class ejercicio_2_DO_WHILE {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		int num=0;
		
		do {
			if(num != 13 && num !=10) {
				System.out.println("Ingrese un valor entero: ");
			}
			num= System.in.read();
		} while (num< 48 || num>=58);
		
		System.out.println("El numero es: "+ (char) num);

	}

}
