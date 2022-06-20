package tp3;

public class Circulo extends Figura{
	private double radio;
	
	public Circulo() {
		
	}
	
	public Circulo(double radio) {
		super("Circulo");
		this.radio = radio;
	}
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getArea() {
		return 3.14 * Math.pow(radio, 2);
	}
	
	public String toString() {
		return "Hola soy un objeto de tipo Circulo ";
	}
}
