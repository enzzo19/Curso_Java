package tp2;

public class NumerosEnteros {
	//Atributos
	private int numero;
	
	// Constructores
	// Constructor por defecto
	public NumerosEnteros() {
		
	}
	// Constructor Copia
	public NumerosEnteros(NumerosEnteros num) {
			this.numero = num.numero;
		}
	// Constructor Normal
	public NumerosEnteros(int num) {
		this.numero = num;
	}
	
	// Metodos setter y getter
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	// Redefinicion de operaciones elementales
	public int suma(NumerosEnteros num) {
		
		return this.numero + num.numero; 
		}
	
	public int suma(int num) {
		
		return this.numero + num; 
		}

	public int resta(NumerosEnteros num) {
		
		return this.numero - num.numero; 
		}
	
	public int multi(NumerosEnteros num) {
		
		return this.numero * num.numero; 
		}
	
	public int div(NumerosEnteros num) {
		if (num.numero == 0) {
			System.out.println("No se puede realizar la operacion de Division");
			return -1;
		}
		else {
			return this.numero / num.numero;
			}
		}
	
	public static void main(String args[] ) {
		NumerosEnteros numerito = new NumerosEnteros(5);
		System.out.println(numerito.getNumero());
		
		NumerosEnteros numerito2 = new NumerosEnteros();
		System.out.println(numerito2.getNumero());
		
		System.out.println("La suma es igual a : " + numerito.suma(10));
		System.out.println("La resta es igual a : " + numerito.resta(numerito2));
		System.out.println("La multiplicacion es igual a : " + numerito.multi(numerito2));
		if (numerito.div(numerito2) != -1) {
			System.out.println("La division es igual a : " + numerito.div(numerito2));
		}
		
	}
}
