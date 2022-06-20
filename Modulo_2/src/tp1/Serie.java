package tp1;

public class Serie {
	//Atributos
	private String titulo;
	private int numero_temporadas;
	private String genero;
	private String creador;
	
	//Constructores
	public Serie() {
		
	}
	
	public Serie(Serie serie) {
		this.titulo = serie.titulo;
		this.numero_temporadas = serie.numero_temporadas;
		this.genero = serie.genero;
		this.creador = serie.creador;
	}
	
	public Serie(String titulo, int temporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numero_temporadas = temporadas;
		this.genero = genero;
		this.creador = creador;
	}
	
	//Metodos Getter y setter
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumero_temporadas() {
		return numero_temporadas;
	}

	public void setNumero_temporadas(int numero_temporadas) {
		this.numero_temporadas = numero_temporadas;
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
	
	
}
