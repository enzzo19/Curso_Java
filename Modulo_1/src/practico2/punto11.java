package practico2;
import java.util.Scanner;
public class punto11 {
	public static void main(String []args) {
		//inicio

        int lado1,lado2,lado3; //lados del triangulo 

        //leyendo las 3 entradas por consola
        Scanner entrada = new Scanner(System.in); 
        System.out.println("ingrese lado 1: ");
        lado1= entrada.nextInt();
        System.out.println("ingrese lado 2: ");
        lado2= entrada.nextInt();
        System.out.println("ingrese lado 3: ");
        lado3= entrada.nextInt();

        //comparando los lados y mostrando el tipo de triangulo
        if(lado1==lado2 && lado2==lado3) {
            System.out.println("El triangulo es esquilatero");
        }
        if((lado1==lado2 && lado1!=lado3) ||(lado1==lado3 && lado1 != lado2) || (lado2 == lado3 && lado2 != lado1)) {
            System.out.println("El triangulo es isoceles: ");
        }
        if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
            System.out.println("El triangulo es escaleno");
        }

        //fin
	}
}
