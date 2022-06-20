package tp3;

public class Pera extends Fruta{
    
	private String nombre;
    public Pera(double peso){
        super(peso);
        this.nombre = "Pera";
    }

    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double hacerJugo(){
        return super.getPeso() * 0.6;
    }
}

