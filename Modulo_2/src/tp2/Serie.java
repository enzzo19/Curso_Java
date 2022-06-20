package tp2;

//Ejercicio2
public class Serie {
	private String titulo;
	private int	numTemporadas;
	private String genero;
	private String creador;
	
	// Constructor Defecto
	public Serie() {	
	}
	// Constructor Copia
	public Serie(Serie serie){
		this.titulo = serie.titulo;
		this.numTemporadas = serie.numTemporadas;
		this.genero = serie.genero;
		this.creador = serie.creador;
	}
	//Constructor Normal
	public Serie(String tit, int nt, String gen, String cr) {
		this.titulo = tit;
		this.numTemporadas = nt;
		this.genero = gen;
		this.creador =cr;
	}
	

	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getNumTemporadas() {
		return numTemporadas;
	}
	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}

	public void mostrar() {
		System.out.println("************Datos de la Serie************");
		System.out.println("Titulo de la Serie: "+ this.titulo);
		System.out.println("Numero de Temporada: "+ this.numTemporadas);
		System.out.println("Genero: "+ this.genero);
		System.out.println("Creador: "+ this.creador);
	}
	
	//Programa Principal
	public static void main(String args[]) {
		Serie serie1 = new Serie("El juego del calamar",3,"Suspenso","Oliver Gant");
		serie1.mostrar();
		//Modificar los datos
		serie1.setTitulo("La casa de papel");
		serie1.setNumTemporadas(4);
		serie1.setGenero("Terror");
		serie1.setCreador("Von Newman");
		System.out.println();
		serie1.mostrar();
		System.out.println();
		Serie serie2 = new Serie("Vikingos",9,"Accion","Oliver Gant");
		serie2.mostrar();
	}
}


