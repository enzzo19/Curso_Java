package model.herencia;

public class Gato extends Animal{
	private String raza;
	private int edad;
	private int cant_vacunas;
	private String color_ojos;
	private String sexo;
	



	public Gato(String raza, int edad, int cant_vacunas, String color_ojos, String sexo) {
		super();
		this.raza = raza;
		this.edad = edad;
		this.cant_vacunas = cant_vacunas;
		this.color_ojos = color_ojos;
		this.sexo = sexo;
	}
	
	


	public Gato(double peso, int tamaño, String nombre, String raza, int edad, int cant_vacunas, String color_ojos,
			String sexo) {
		super(peso, tamaño, nombre);
		this.raza = raza;
		this.edad = edad;
		this.cant_vacunas = cant_vacunas;
		this.color_ojos = color_ojos;
		this.sexo = sexo;
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


	public String getColor_ojos() {
		return color_ojos;
	}




	public void setColor_ojos(String color_ojos) {
		this.color_ojos = color_ojos;
	}




	public String getSexo() {
		return sexo;
	}




	public void setSexo(String sexo) {
		this.sexo = sexo;
	}




	public void setCant_vacunas(int cant_vacunas) {
		this.cant_vacunas = cant_vacunas;
	}
	
	public void gritar() {
		System.out.println("MIAU MIAU  soy un gato !!");
	}
	
	public boolean puedeSaltar(int altura) {
		return (altura < this.getTamaño() + 100);
	}
	
	public boolean puedeComer(String alimento) {
		if (alimento.equals("pequeño") && this.edad < 2) {
			return true;
		}else {
			return false;
		}
	}
	

}
