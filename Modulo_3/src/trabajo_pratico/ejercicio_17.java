package trabajo_pratico;

public class ejercicio_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double resultado = potencia(2, 5);
		System.out.println(resultado);
	}
	
	public static double potencia(double base, int exponente) {
		if(exponente == 0) {
			return 1;
		}else {
			double resultado_parcial = potencia(base, exponente - 1);
			System.out.println(resultado_parcial);
			return base * resultado_parcial;
		}
		
	}

}
