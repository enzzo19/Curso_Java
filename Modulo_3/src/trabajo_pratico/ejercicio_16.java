package trabajo_pratico;

public class ejercicio_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(binario(100));
		
	
	}
	
	public static int binario(int numero) {
		if (numero == 0 || numero == 1) {
			return numero;
		}else {
			if (numero != 0) {
				int resto = numero % 2;
				return binario(numero / 2) * 10 + resto;
			}else {
				return 0;
			}
		}
	}
}
