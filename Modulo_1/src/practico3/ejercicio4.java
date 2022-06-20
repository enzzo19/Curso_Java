package practico3;

public class ejercicio4 {
	public static void main(String args[]) {
		int vector [] = new int [20];
		int contador = 0;
		
		for (int posicion  = 0; posicion < vector.length; posicion++) {
			vector[posicion] = (int)(Math.random() * 100 ) + 1;
		}
		
		for (int posicion  = 0; posicion < vector.length; posicion++) {
			System.out.print(vector[posicion]+ " - ");
		}
		System.out.println();
		for (int posicion  = 0; posicion < vector.length; posicion++) {
			if (vector[posicion] % 5 == 0) {
				System.out.println("Encontre un numero divisible por 5 en la posicion: "+ posicion + " su valor es: " + vector[posicion]);
				contador++;
			}
		}
		System.out.println();
		System.out.println("------------------------------------------------------------");
		System.out.println("Tu arreglo tiene: "+ contador + " numero divisibles entre 5");
	}
}
