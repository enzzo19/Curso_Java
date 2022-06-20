package trabajo_pratico;

import java.io.IOException;

public class ejercicio_2_CM4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int num = 0;
		while(num < 48 || num >= 58) {
			if(num != 13 && num != 10) {
				System.out.println("Ingresa un Valor entero: ");
			}
			num = System.in.read();
		}
		System.out.println("El numero ingresado es: " + (char)num);
	}

}
