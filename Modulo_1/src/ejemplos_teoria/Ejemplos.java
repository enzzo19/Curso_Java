package ejemplos_teoria;

public class Ejemplos {
	public static void main(String args []) {
		
	int vector [] = new int [5];
	vector[0] = 3;
	vector[1] = 2;
	vector[2] = 7;
	vector[3] = 1;
	vector[4] = 5;
	
	System.out.println(vector[2]);
	Seleccion(vector);
	System.out.println(vector[2]);
	}
	
	public static void Seleccion(int[]vector){
        int i, j, k, p, auxiliar, limit = vector.length-1;
        for(k = 0; k < limit; k++){
            p = k;
            for(i = k+1; i <= limit; i++){
                if(vector[i] < vector[p]) p = i;
                if(p != k){
                    auxiliar = vector[p];
                    vector [p] = vector[k];
                    vector[k] = auxiliar;
                }
            }
        }
    }

}
