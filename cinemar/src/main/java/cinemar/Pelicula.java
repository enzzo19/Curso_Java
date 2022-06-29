package cinemar;

public class Pelicula {
	private int id_pelicula;
	private String titulo_Pelicula;
	private String Sinopsis;
	private String genero;
	private String duracion;
	private String actores;
	private String director;
	private TipoPelicula id_tipo_pelicula;
	private Clasificacion id_clasificacion;
	
	public Pelicula() {
		
	}
	
	public Pelicula(int id_pelicula, String titulo_Pelicula, String sinopsis, String genero, String duracion,
			String actores, String director, TipoPelicula id_tipo_pelicula, Clasificacion id_clasificacion) {
		super();
		this.id_pelicula = id_pelicula;
		this.titulo_Pelicula = titulo_Pelicula;
		Sinopsis = sinopsis;
		this.genero = genero;
		this.duracion = duracion;
		this.actores = actores;
		this.director = director;
		this.id_tipo_pelicula = id_tipo_pelicula;
		this.id_clasificacion = id_clasificacion;
	}

	public int getId_pelicula() {
		return id_pelicula;
	}

	public void setId_pelicula(int id_pelicula) {
		this.id_pelicula = id_pelicula;
	}

	public String getTitulo_Pelicula() {
		return titulo_Pelicula;
	}

	public void setTitulo_Pelicula(String titulo_Pelicula) {
		this.titulo_Pelicula = titulo_Pelicula;
	}

	public String getSinopsis() {
		return Sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		Sinopsis = sinopsis;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public String getActores() {
		return actores;
	}

	public void setActores(String actores) {
		this.actores = actores;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public TipoPelicula getId_tipo_pelicula() {
		return id_tipo_pelicula;
	}

	public void setId_tipo_pelicula(TipoPelicula id_tipo_pelicula) {
		this.id_tipo_pelicula = id_tipo_pelicula;
	}

	public Clasificacion getId_clasificacion() {
		return id_clasificacion;
	}

	public void setId_clasificacion(Clasificacion id_clasificacion) {
		this.id_clasificacion = id_clasificacion;
	}

	@Override
	public String toString() {
		return "Pelicula [id_pelicula=" + id_pelicula + ", titulo_Pelicula=" + titulo_Pelicula + ", Sinopsis="
				+ Sinopsis + ", genero=" + genero + ", duracion=" + duracion + ", actores=" + actores + ", director="
				+ director + ", id_tipo_pelicula=" + id_tipo_pelicula + ", id_clasificacion=" + id_clasificacion + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
