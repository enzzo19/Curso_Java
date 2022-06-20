package tp2;

public class Producto {
	
	private int id;
	private String nombre;
	private String categoria;
	private double precio;
	private int stock;
	
	public Producto() {
		
	}
	
	public Producto(int id, String nombre, String categoria, double precio, int stock) {
		this.id = id;
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.stock = stock;
		
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

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) { 
		this.stock = stock;
	}

	public boolean validarStock() {
		return this.stock > 0;
	}
	
	public void vender(String categoria, int unidades) {
		if(unidades < this.stock) {
			if (categoria.equals(this.categoria)) {
				double total = this.precio * unidades;
				this.setStock(this.getStock() - unidades);
				System.out.println("Total a Pagar: " + total);
				
			}else {
				System.out.println("Las Categorias son diferentes");
			}
		}else {
			System.out.println("No hay Stock");
		}
	}
}
