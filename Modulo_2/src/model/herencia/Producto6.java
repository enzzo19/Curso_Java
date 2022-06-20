package model.herencia;

public class Producto6 {
	private int id;
	private String nombre;
	private double precio;
	private int vencimiento;
	private int stock;
	private String marca;
	
	public Producto6() {
		
	}

	public Producto6(int id, String nombre, double precio, int vencimiento, int stock, String marca) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.vencimiento = vencimiento;
		this.stock = stock;
		this.marca = marca;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getVencimiento() {
		return vencimiento;
	}

	public void setVencimiento(int vencimiento) {
		this.vencimiento = vencimiento;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void mostrar() {
		System.out.println("Datos del producto: " + this.id);
		System.out.println("Nombre del Producto: " + this.nombre);
		System.out.println("Precio del Producto: $" + this.precio);
		System.out.println("Vencimiento : " + this.vencimiento + " dias");
		System.out.println("Cantidad de Stock: " + this.stock);
		System.out.println("Marca: " + this.marca);
	}
	
	
	

}
