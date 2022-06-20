package model.herencia;

public class Animal {
	private double peso;
	private int tama�o;
	private String nombre;
	
	
	public Animal() {
		
	}
	
	public Animal(double peso, int tama�o, String nombre) {
		super();
		this.peso = peso;
		this.tama�o = tama�o;
		this.nombre = nombre;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getTama�o() {
		return tama�o;
	}

	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	
	public void gritar() {
		System.out.println("Soy un animal !");
	}

}
