package practico3;
import java.util.Scanner;
public class ejercicio1 {
	public static void main(String args[]) {
		int[] vector = new int[10]; // restriccion de 10 elementos, de tipo enteros
		
		cargar(vector);
		mostrar(vector);
		
	}
	
	public static void cargar(int[] vector) {
		Scanner lectura = new Scanner(System.in);
		System.out.println("Ingrese Numeros enteros");
		for (int i = 0; i < 10 ; i++) {
			System.out.print("Ingrese el numero "+(i+1)+": ");
			vector[i] = lectura.nextInt();
		}
		lectura.close();
		System.out.println("Vector Cargado");
	}
	
	public static void mostrar(int[] vector) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " " + vector[i]);
		}
	}
}

