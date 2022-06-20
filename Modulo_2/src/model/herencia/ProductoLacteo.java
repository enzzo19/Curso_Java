package model.herencia;

public class ProductoLacteo extends Producto6{
	private double cant_leche;
	private int temp_refrigeracion;
	
	public ProductoLacteo() {
		
	}
	
	public ProductoLacteo(double cant_leche, int temp_refrigeracion) {
		super();
		this.cant_leche = cant_leche;
		this.temp_refrigeracion = temp_refrigeracion;
	}


	public ProductoLacteo(int id, String nombre, double precio, int vencimiento, int stock, String marca,
			double cant_leche, int temp_refrigeracion) {
		super(id, nombre, precio, vencimiento, stock, marca);
		this.cant_leche = cant_leche;
		this.temp_refrigeracion = temp_refrigeracion;
	}

	public double getCant_leche() {
		return cant_leche;
	}

	public void setCant_leche(double cant_leche) {
		this.cant_leche = cant_leche;
	}

	public int getTemp_refrigeracion() {
		return temp_refrigeracion;
	}

	public void setTemp_refrigeracion(int temp_refrigeracion) {
		this.temp_refrigeracion = temp_refrigeracion;
	}
	
	public void mostrar() {
		System.out.println("Datos del producto: " + super.getId());
		System.out.println("Nombre del Producto: " + super.getNombre());
		System.out.println("Precio del Producto: $" + super.getPrecio());
		System.out.println("Vencimiento : " + super.getVencimiento() + " dias");
		System.out.println("Cantidad de Stock: " + super.getStock());
		System.out.println("Marca: " + super.getMarca());
		System.out.println("Cant de Leche del Producto: " + this.cant_leche + "%");
		System.out.println("Temperatura de Refrigeracion: " + this.temp_refrigeracion + "°C");
	}

}
