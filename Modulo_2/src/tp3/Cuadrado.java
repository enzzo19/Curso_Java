package tp3;

public class Cuadrado extends Figura{
	private double base;
	private double altura;
	
	public Cuadrado() {
		
	}
	
	public Cuadrado(double base, double altura) {
		super("Cuadrado");
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	public double getArea() {
		return base * altura;
	}
}
