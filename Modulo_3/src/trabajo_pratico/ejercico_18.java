package trabajo_pratico;

public class ejercico_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(5));
	}
	
	public static long factorial(int numero) {
		if(numero == 0) {
			return 1;
		}else {
			long resultado_parcial = factorial(numero - 1);
			System.out.println(resultado_parcial);
			return numero * resultado_parcial;
			
		}
	}
}
