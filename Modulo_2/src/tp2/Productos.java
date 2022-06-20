package tp2;

public class Productos {
	private String nombre;
	private double precio;
	private int vencimiento;
	private boolean perecederos;
	
	
	public Productos() {
		
	}
	
	public Productos(String nombre, double precio, int vencimiento, boolean perce) {
		this.nombre = nombre;
		this.precio = precio;
		this.vencimiento = vencimiento;
		this.perecederos = perce;
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

	public boolean isPerecederos() {
		return perecederos;
	}

	public void setPerecederos(boolean perecederos) {
		this.perecederos = perecederos;
	}
	
	public double calcular(int cantidad) {
		if (perecederos == false) {
			return this.precio * cantidad;
		}else {
			if (vencimiento == 3) {
				return (this.precio * cantidad) / 2;
			}else if (vencimiento == 2) {
				return (this.precio * cantidad) / 3;
			}
			else if(vencimiento == 1) {
				return (this.precio * cantidad) / 4;
			}else {
				return this.precio * cantidad;
			}
		}
	}
}
