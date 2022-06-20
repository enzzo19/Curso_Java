package tp3;

public class Manzana extends Fruta{
	private String nombre;
    
    public Manzana(double peso){
        super(peso);
        this.nombre = "Manzana";
    }

    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double hacerJugo(){
        return super.getPeso() * 0.3;
    }
}
