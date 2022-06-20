package practico3;
import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) {
        
        int n = 10;
        float [] list = new float [n];
        ingreso(n, list);

        int opc = eleccion();
        for (int i = 0; i<n ; i++){
        	
        	System.out.print(list[i] + " ");
        }
        System.out.println();

        eliminacion(n, list, opc);
        n -=1;
        
		for (int i = 0; i<n ; i++){
		        	
		        	System.out.print(list[i] + " ");
		        }
        // salida(n, list);
        
    }
    public static void ingreso(int n, float [] lista) {
    	Scanner lect = new Scanner(System.in);

        for (int i = 0; i < lista.length; i++){
            System.out.println("Ingrese un valor: ");
            lista[i] = lect.nextFloat();
        }
    }
    public static int eleccion(){
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese un numero entre el 0 y 9: ");
        int opc = lectura.nextInt();
        return opc;
       
    }
    public static void eliminacion(int n, float [] lista, int posicion){
        for(int i = posicion;i<(n-1); i++ ){
            lista[i] = lista[i+1];
        }
    }
    public static void salida(int n, float []lista){
        for (int j=0;j<n;j++){
            System.out.println("El elemento "+j+" tiene el valor "+lista[j]);
        }
    }
}

