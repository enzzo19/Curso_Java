package ejemplos_teoria;

public class Recursividad {
	
	 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*
	int[] mi_arreglo = new int[6];
	mi_arreglo[0] = 6;
	mi_arreglo[1] = 40;
	mi_arreglo[2] = 13;
	mi_arreglo[3] = -1;
	mi_arreglo[4] = 0;
	mi_arreglo[5] = 9;
	
	int valor = sumarLista(mi_arreglo, 6);
	
	System.out.println(valor);
	*/
		
	System.out.println(factorial(4));
	}
	
	public static int sumarLista(int[] lista, int n){  
		if(n==0){  
		 		return 0;  
		}  
		else {
			
			int ultimo = lista[n-1]; 
			System.out.println("Elemento que saca de la lista: " + ultimo);
			return ultimo + sumarLista(lista, n-1); 
		}
	} 
	
	public static long factorial(long n){  
		if(n == 100) {
			return 1;
		}else {
			long valor = factorial(n-1); 
			System.out.println(valor);
			return n* valor; 
		}  
	}
}
