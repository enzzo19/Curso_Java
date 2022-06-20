package tp1;

public class main {

	public static void main(String args[]) {

		NumerosEnteros numerito = new NumerosEnteros(10);

		NumerosEnteros numerito2 = new NumerosEnteros(5);

		System.out.println("Los numeros son: " + numerito.getValor() + " y " + numerito2.getValor());
		System.out.println("La suma es: " + numerito.suma(numerito2));
		System.out.println("La resta es: " + numerito.resta(numerito2));
		System.out.println("La multiplicacion es: " + numerito.multiplicacion(numerito2));

		if (numerito.div(numerito2) != -1) {
			System.out.println("La division es: " + numerito.div(numerito2));
		}

	}

}
