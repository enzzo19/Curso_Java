package model.herencia;

public class Animal {
	private double peso;
	private int tamaño;
	private String nombre;
	
	
	public Animal() {
		
	}
	
	public Animal(double peso, int tamaño, String nombre) {
		super();
		this.peso = peso;
		this.tamaño = tamaño;
		this.nombre = nombre;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
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
