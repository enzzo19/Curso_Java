package tp2;


public class Contacto {
	private String nombre;
	private int numero;
	
	public Contacto() {
		
	}
	
	public Contacto(String nombre, int numero) {
		this.nombre = nombre;
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public boolean equals(Contacto contacto) {
		
		return this.nombre.equals(contacto.getNombre());
		
	}
	
	public String toString() {
		return "Nombre: "+ this.nombre + " numero: "+ this.numero; 
	}
	
	
}
