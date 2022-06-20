package practico3;

public class ejercicio11 {
	public static void main(String []args) {
		double numero1 = 100;
		double numero2 = 4;
		
		int resultado = multiplicacion(numero1, numero2);
		System.out.println("El resultado de la multiplicacion entre " + numero1+ " y " + numero2+ " es: " +resultado);
	
	}
	
	public static int multiplicacion(double num1, double num2) {
		int resultado;
		return resultado = (int) (num1 * num2);
	}
}
