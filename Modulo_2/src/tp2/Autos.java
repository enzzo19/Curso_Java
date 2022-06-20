package tp2;

public class Autos {
	
	// ATRIBUTOS
	private int cant_ruedas;
	private int modelo;
	private int cant_puertas;
	private String marca;
	private String tipo_motor;
	private String cant_asientos;
	private boolean levanta_cristales;
	private String patente;
	private int cap_combustible;
	private String color; 
	
	//Constructores
	//Constructor Defecto
	public Autos() {
		
	}
	//Constructor Copia
	public Autos(Autos auto) {
		this.modelo = auto.modelo;
		this.tipo_motor = auto.tipo_motor;
		this.marca = auto.marca;
		this.color = auto.color;
	}
	
	//Constructor Normal
	public Autos(int modelo, String tipo_motor, String marca, String color) {
		this.modelo = modelo;
		this.tipo_motor = tipo_motor;
		this.marca = marca;
		this.color = color;
	}
	
	public void mostrar() {
		System.out.println("Los Datos de este Auto son: ");
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Tipo de motor: " + this.tipo_motor);
		System.out.println("Marca: " + this.marca);
		System.out.println("Color: " + this.color);
	}
	
		
	public static void main(String args[]) {
		Autos Clio = new Autos(2000, "1.4", "Renault Clio", "Gris");
		Clio.mostrar();
		
		System.out.println();
		
		Autos Clio_copia = new Autos(Clio);
		Clio_copia.mostrar();
		
	}
	
}


