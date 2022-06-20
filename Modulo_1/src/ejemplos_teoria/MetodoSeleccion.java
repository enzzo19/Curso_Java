package ejemplos_teoria;

public class MetodoSeleccion {
	public static void main(String args[]) {
		
		int [] vector = new int [5];
		vector[0] = 5;
		vector[1] = 3;
		vector[2] = 4;
		vector[3] = 1;
		vector[4] = 2;
		
		for (int i = 0; i<5; i++) {
			System.out.print(vector[i] + " - ");
		}
		System.out.println();
		
		seleccion(vector);
		
		for (int i = 0; i<5; i++) {
			System.out.print(vector[i] + " - ");
		}
		System.out.println();
		
		
		
			
	}
	//m�todo java de ordenaci�n por selecci�n
	public static void seleccion(int A[]) {
	          int i, j, menor, pos, tmp;
	          for (i = 0; i < A.length - 1; i++) {      // tomamos como menor el primero
	                menor = A[i];                       // de los elementos que quedan por ordenar                    
	                pos = i;                            // y guardamos su posici�n
	                for (j = i + 1; j < A.length; j++){ // buscamos en el resto
	                      if (A[j] < menor) {           // del array alg�n elemento
	                          menor = A[j];             // menor que el actual
	                          pos = j;
	                      }
	                }
	                if (pos != i){                      // si hay alguno menor se intercambia                         
	                    tmp = A[i];
	                    A[i] = A[pos];
	                    A[pos] = tmp;
	                }
	          }
	}
}



	
