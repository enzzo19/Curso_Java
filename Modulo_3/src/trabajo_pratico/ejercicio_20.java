package trabajo_pratico;

public class ejercicio_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibonacci(7));
		
	}
	public static int fibonacci(int numero) {
		if(numero == 0 || numero == 1) {
			return numero;
		}
		else {
			return fibonacci(numero - 2) + fibonacci(numero - 1);
		}
	}
}
