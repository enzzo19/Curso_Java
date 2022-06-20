package practico2;

public class punto4 {
	public static void main(String args[]){
		double num = 11.5;
		double num2 = 2.3;
		
		double suma = num + num2;
		System.out.println("la suma entre "+num+" y "+num2+" es igual a :"+ (num+num2));
		double multi= num * num2;
		System.out.println("La multiplicacion entre "+num+" y "+num2+" es "+multi);
		double resta= num - num2;
		System.out.println("La resta entre "+num+" y "+num2+" es "+resta);
		
		if (num2 != 0) {
			double div = num / num2;
			System.out.println("La division entre "+num+" y "+num2+" es "+div);
			double resto = num % num2;
			System.out.println("La resto entre "+num+" y "+num2+" es "+ resto);
		}else {
			System.out.println("El denominadors es 0 no puedo hacer la division");
		}
	}
}
