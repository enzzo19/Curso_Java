package practico3;
import java.util.Scanner;
public class ejercicio10 {
	public static void main(String args[]) {
		
		// Creo mi objeto scanner para capturar datos
		Scanner entrada = new Scanner(System.in);
		
		// Cantidad de filas y columnas de nuestra matriz
        int m,n ;
        
        // Ingresa la cantidad de filas y de columnas
        System.out.println("ingrese la cantidad de filas para las matrices: ");
        m = entrada.nextInt(); // cantidad de filas
        System.out.println("ingrese la cantidad de columnas para las matrices: ");
        n=entrada.nextInt(); // cantidad de columnas
        
        
        int matrizA[][] = new int[m][n];  // Crea las matrices
        int matrizB[][] = new int[m][n];
        int matrizC[][] = new int[m][n];
        
        
        // Ingresar los valores de la matriz A
        System.out.println("Ingresando los numeros de matriz A");
        for(int i=0; i < m ; i++){
            for(int j=0; j < n; j++){
                System.out.println("ingrese el elemento ["+i+"]"+"["+j+"]: ");
                matrizA[i][j] = entrada.nextInt();
            }
        }
        
        // Ingresar los valores de la matriz B
        System.out.println("Ingresando los numero de matriz B");
        for(int i=0; i < m; i++){
            for(int j=0; j < n; j++){
                System.out.println("ingrese el elemento ["+i+"]"+"["+j+"]: ");
                matrizB[i][j] = entrada.nextInt();
            }
        }
        
        
        // Matriz con las suma correspondiente
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        System.out.println("Se creo la matriz C a partir de A y B");
        entrada.close();
        
        System.out.println("MATRIZ A");
        mostrarMatriz(matrizA);
        System.out.println("MATRIZ B");
        mostrarMatriz(matrizB);
        System.out.println("MATRIZ C-RESULTADO");
        mostrarMatriz(matrizC);
        
        
	}
	
	public static void mostrarMatriz(int matriz[][]) {
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                System.out.print(matriz[i][j] + " ");                
            }
            System.out.println();
        }
        System.out.println();
	}

}
