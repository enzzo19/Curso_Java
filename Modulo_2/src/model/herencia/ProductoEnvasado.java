package model.herencia;

public class ProductoEnvasado extends Producto6{

	private String envasado;
	
	public ProductoEnvasado() {
		
	}

	public ProductoEnvasado(String envasado) {
		super();
		this.envasado = envasado;
	}

	public ProductoEnvasado(int id, String nombre, double precio, int vencimiento, int stock, String marca,
			String envasado) {
		super(id, nombre, precio, vencimiento, stock, marca);
		this.envasado = envasado;
	}
	
	public void mostrar() {
		System.out.println("Datos del producto: " + super.getId());
		System.out.println("Nombre del Producto: " + super.getNombre());
		System.out.println("Precio del Producto: $" + super.getPrecio());
		System.out.println("Vencimiento : " + super.getVencimiento() + " dias");
		System.out.println("Cantidad de Stock: " + super.getStock());
		System.out.println("Marca: " + super.getMarca());
		System.out.println("Forma de Envasado: " + this.envasado);
	}
	
}
