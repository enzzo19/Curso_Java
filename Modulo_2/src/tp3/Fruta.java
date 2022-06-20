package tp3;

public class Fruta {
    private double peso;
    private String nombre = "";

    public Fruta(double Peso) {
        this.setPeso(Peso);
    }

    //setter y getter
    
    public double getPeso() {
        return peso;
    }

    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPeso(double peso) {
        this.peso = peso;
    }

    //metodo

    public double hacerJugo() {
        return 0;
    }
}

