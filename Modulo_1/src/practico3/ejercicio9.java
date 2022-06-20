package practico3;
public class ejercicio9 {
	public static void main(String args[]) {
		int[][] a = new int[3][3]; 
		int nro=1;
		
		for (int i = 0; i < 3; i++) {		
			for (int j = 0; j < 3; j++){
				a[i][j] = nro;
				nro++;
			}
		}
		
		for (int filas = 0; filas < 3; filas++) {		
			for (int columnas = 0; columnas < 3; columnas++){	
			System.out.print(a[filas][columnas]+"  ");
			}
		System.out.println();
		}
	}

}
