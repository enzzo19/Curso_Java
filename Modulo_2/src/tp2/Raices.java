package tp2;

public class Raices {
	
	//Atributos
	private double a;
	private double b;
	private double c;
	
	//Constructores
	
	public Raices() {
		
	}
	
	public Raices(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	//Metodos de acceso
	
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
	
	
	// Metodos de clase
	
	public double getDiscriminante() {
		return (Math.pow(b, 2) - 4 * this.a * this.c);
	}
	
	public void obtenerRaices() {
		double raiz1 = (-this.b + Math.sqrt(this.getDiscriminante()))/ (2 * this.a);
		double raiz2 = (-this.b - Math.sqrt(this.getDiscriminante()))/ (2 * this.a);
		System.out.println("La raiz 1 es igual a : " + raiz1);
		System.out.println("La raiz 2 es igual a : " + raiz2);
	}
	
	public void obtenerRaiz() {
		double raiz = -this.b /(2 * this.a);
		System.out.println("La raiz es igual a : " + raiz);
	}
	
	public boolean tieneRaices() {
		return this.getDiscriminante() > 0;
	}
	
	public boolean tieneRaiz() {
		boolean control = true;
		if (this.getDiscriminante() != 0) {
			control = false;
		}
		return control;
	}
	
	public void calcula() {
		if(this.tieneRaices()) {
			this.obtenerRaices();
		}else if(this.tieneRaiz()){
			this.obtenerRaiz();
		}else {
			System.out.println("La ecuacion no tiene Solucion !!");
		}
	}
}
