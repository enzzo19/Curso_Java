package practico3;
import java.util.Scanner;
public class ejercicio1b {
	public static void main(String []args) {
		int vector [] = new int [10];
		
		IngresarDatos(vector);
		
		MostrarDatos(vector);
		
	}
	
	public static void IngresarDatos(int arreglo[]) {
		Scanner entrada = new Scanner(System.in);
		for (int posicion = 0; posicion < arreglo.length; posicion++) {
			System.out.println("Ingresa un valor numerico: ");
			arreglo[posicion] = entrada.nextInt();
		}
		entrada.close();
	}
	
	public static void MostrarDatos(int arreglo[]) {
		for (int posicion = 0; posicion < arreglo.length; posicion++) {
			System.out.println("En la posicion "+ (posicion + 1)+ " se encuentra el valor: "+ arreglo[posicion]);
		}
	}
	
}
