package tp1;

public class NumerosEnteros {
	//Atributo
		private int valor;
	//Constructores
	public NumerosEnteros() {
		
	}
	
	public NumerosEnteros(NumerosEnteros numero) {
		this.valor = numero.valor;
	}
	
	public NumerosEnteros(int num) {
		this.valor = num;
	}

	//Metodos
	
	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public int suma(NumerosEnteros num) {
		return this.getValor() + num.getValor();
	}
	
	public int resta(NumerosEnteros num) {
		return this.getValor() - num.getValor();
	}
	
	public int multiplicacion(NumerosEnteros num) {
		return this.getValor() * num.getValor();
	}
	
	public int div(NumerosEnteros num) {
		
		if (num.getValor() != 0) {
			return this.getValor() / num.getValor();
		}else {
			System.out.println("No se puede realizar la operacion de division !");
			return -1;
		}
	}
}
