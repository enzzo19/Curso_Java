package model.herencia;

public class Perro extends Animal{
	private String raza;
	private int edad;
	private int cant_vacunas;
	
	
	public Perro(String raza, int edad, int cant_vacunas) {
		super();
		this.raza = raza;
		this.edad = edad;
		this.cant_vacunas = cant_vacunas;
	}


	public Perro(double peso, int tamaño, String nombre, String raza, int edad, int cant_vacunas) {
		super(peso, tamaño, nombre);
		this.raza = raza;
		this.edad = edad;
		this.cant_vacunas = cant_vacunas;
	}


	public String getRaza() {
		return raza;
	}


	public void setRaza(String raza) {
		this.raza = raza;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public int getCant_vacunas() {
		return cant_vacunas;
	}


	public void setCant_vacunas(int cant_vacunas) {
		this.cant_vacunas = cant_vacunas;
	}
	
	public void gritar() {
		System.out.println("GUA GUA  soy un perro !!");
	}
	

}
