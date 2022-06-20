package ejemplos_teoria;


public class BusquedaBinaria {
	public static void main(String args[]) {
		
		int [] vector = new int[5];
		vector[0] = 0;
		vector[1] = 2;
		vector[2] = 5;
		vector[3] = 6;
		vector[4] = 8;
		for (int i = 0; i<5 ; i++) {
			System.out.print(vector[i] + "  ");
		}
		System.out.println();
		
		int posicion = busquedaBin(vector, 5);
		
		System.out.println("El elemento se enucentra en la posicion: " + posicion);
	}
	public static int busquedaSecuencial(int []arreglo,int dato){
		 int posicion = -1;
		  for(int i = 0; i < arreglo.length; i++){//recorremos todo el array
		  	if(arreglo[i] == dato){//comparamos el elemento en el arreglo con el buscado
			posicion = i;//Si es verdadero guardamos la posicion
			break;//Para el ciclo
		   }
		 }
		 return posicion;
		}
	
	public static int busquedaBin( int [] arreglo, int dato) {
		 int inicio = 0;
		 int fin = arreglo.length - 1;
		 int pos;
		 while (inicio <= fin) {
		     pos = (inicio+fin) / 2;
		     if ( arreglo[pos] == dato )
		       return pos;
		     else if ( arreglo[pos] < dato ) {
		  inicio = pos+1;
		     } else {
		  fin = pos-1;
		     }
		 }
		 return -1;
		    }
}
