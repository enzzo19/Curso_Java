package cinemar;

public class TipoPelicula {
	private int id_tipo_pelicula;
	private String idioma;
	private String formato;
	private boolean subtitulada;
	
	public TipoPelicula() {
		
	}
	
	public TipoPelicula(int id_tipo_pelicula, String idioma, String formato, boolean subtitulada) {
		super();
		this.id_tipo_pelicula = id_tipo_pelicula;
		this.idioma = idioma;
		this.formato = formato;
		this.subtitulada = subtitulada;
	}

	public int getId_tipo_pelicula() {
		return id_tipo_pelicula;
	}

	public void setId_tipo_pelicula(int id_tipo_pelicula) {
		this.id_tipo_pelicula = id_tipo_pelicula;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public boolean isSubtitulada() {
		return subtitulada;
	}

	public void setSubtitulada(boolean subtitulada) {
		this.subtitulada = subtitulada;
	}

	@Override
	public String toString() {
		return "TipoPelicula [id_tipo_pelicula=" + id_tipo_pelicula + ", idioma=" + idioma + ", formato=" + formato
				+ ", subtitulada=" + subtitulada + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
