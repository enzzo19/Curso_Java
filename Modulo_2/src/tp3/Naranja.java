package tp3;

public class Naranja extends Fruta{
    
	private String nombre;
	
    public Naranja(double peso){
        super(peso);
        this.nombre = "Naranja";
    }

    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double hacerJugo(){
        return super.getPeso() * 0.8;
    }
}

