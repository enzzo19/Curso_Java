package ejemplos_teoria;

public class Mascota {
	//Atributos
	private String nombre;
	private String especie;
	
	//Constructores
	public Mascota() {
		
	}
	
	public Mascota(String nom, String esp) {
		this.nombre = nom;
		this.especie = esp;
	}
	
	public void ladrar() {
		System.out.println("GUA GUA");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
}
