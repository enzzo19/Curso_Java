package practico2;

public class punto3 {
	public static void main(String [] args) {

		int num1 = 20, num2 = 20, num3 = 23;

		if (num1 > num2 && num1 > num3) {
			System.out.println("num1 es el mayor y el valor es: " + num1); // num1 es el mayor
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("num2 es el mayor y el valor es: " + num2);// num2 es el mayor
		} else if (num3 > num1 && num3 > num2) {
			System.out.println("num3 es el mayor y el valor es: " + num3); // num3 es el mayor
		} else {
			System.out.println("hay numeros que son iguales");
		}

		if (num1 < num2 && num1 < num3) {
			System.out.println("num1 es el menor y el valor es: " + num1); // num1 es el mayor
		} else if (num2 < num1 && num2 < num3) {
			System.out.println("num2 es el menor y el valor es: " + num2);// num2 es el mayor
		} else if (num3 < num1 && num3 < num2) {
			System.out.println("num3 es el menor y el valor es: " + num3); // num3 es el mayor
		} else {
			System.out.println("hay numeros que son iguales y su valor es: ");
		}


	}
}
