package practico2;
import java.util.Scanner;

public class punto8 {
	public static void main (String args []) {
		double segundos;
		double minutos;
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("ingrese los segundos: ");
		
		segundos  = entrada.nextDouble();
		minutos =  segundos / 60;
		
		System.out.println("la cantidad de minutos es: " + minutos );
		
		entrada.close();
	}	
}
