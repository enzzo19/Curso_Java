package practico3;
import java.util.Scanner;
public class ejercicio2 {
	public static void main(String args[]) {
		double vector[] = {3,3,23,67,45,67,43,21,46,78,90,98,65,43,35,56,58,65,21,90}; 
		boolean vector2 [] = new boolean [5];
		for (int i =0;i< vector2.length; i++) {
			System.out.println(vector2[i]);
		}

		System.out.println("El mayor peso es: "+peso_mayor(vector));
		System.out.println("El menor peso es: "+peso_menor(vector));
		supera100(vector);
	}
	
	public static void cargar(double[] vector) {
		Scanner lectura = new Scanner(System.in);
		for (int i =0;i< vector.length; i++) {
			System.out.print("Ingrese el peso de la persona "+(i+1)+": ");
			vector[i]=lectura.nextDouble();
		}
		
	}
	public static double peso_mayor(double[] vector) {
		double mayor = vector[0];
		for (int i = 1; i < vector.length; i++) {
			if (vector[i] > mayor) {
				mayor = vector[i];
			}
		}
		return mayor;
	}
	
	public static double peso_menor(double[] vector) {
		double menor=vector[0];
		for (int i = 1; i < vector.length;i++) {
			if (vector[i] < menor) {
				menor = vector[i];
			}
		}
		return menor;
	}
	
	public static void supera100(double []lista){
        boolean bandera = false;
        for(int i = 0; i<lista.length; i++){
            if(lista[i] > 100){
                System.out.println("Alguna persona supero los 100 Kgs.");
                bandera = true;
                break;
            }
        }
        if (bandera == false){
            System.out.println("Ninguna persona supero los 100 Kgs.");
        }
    }

}
