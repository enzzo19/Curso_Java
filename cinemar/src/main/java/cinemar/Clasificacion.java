package cinemar;

public class Clasificacion {

	 private int id_clasificacion;
	    private int identificador;
	    private String descripcion;

	    public Clasificacion () 
	    {}

	    public Clasificacion(int id_clasificacion, int identificador, String descripcion) {
	        super();
	        this.id_clasificacion = id_clasificacion;
	        this.identificador = identificador;
	        this.descripcion = descripcion;
	    }

	    public int getId_clasificacion() {
	        return id_clasificacion;
	    }

	    public void setId_clasificacion(int id_clasificacion) {
	        this.id_clasificacion = id_clasificacion;
	    }

	    public int getIdentificador() {
	        return identificador;
	    }

	    public void setIdentificador(int identificador) {
	        this.identificador = identificador;
	    }

	    public String getDescripcion() {
	        return descripcion;
	    }

	    public void setDescripcion(String descripcion) {
	        this.descripcion = descripcion;
	    }

	    @Override
	    public String toString() {
	        return "Clasificacion [id_clasificacion=" + id_clasificacion + ", identificador=" + identificador
	                + ", descripcion=" + descripcion + "]";
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}