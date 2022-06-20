package tp2;

public class Taxi {
	private int id;
	private  int num_taxi;
	private  int tipo_tarifa;
	private double precio_bandera;
	
	public Taxi() {
		
	}
	
	public Taxi(int id, int num_taxi, int tipo_tarifa) {
		this.id = id;
		this.num_taxi = num_taxi;
		this.tipo_tarifa = tipo_tarifa;
		if (tipo_tarifa == 1) {
			this.precio_bandera = 58;
		}else {
			this.precio_bandera = 70;
		}
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNum_taxi() {
		return num_taxi;
	}

	public void setNum_taxi(int num_taxi) {
		this.num_taxi = num_taxi;
	}

	public int getTipo_tarifa() {
		return tipo_tarifa;
	}

	public void setTipo_tarifa(int tipo_tarifa) {
		this.tipo_tarifa = tipo_tarifa;
	}

	public double getPrecio_bandera() {
		return precio_bandera;
	}

	public void setPrecio_bandera(double precio_bandera) {
		this.precio_bandera = precio_bandera;
	}
	
	
	public void cambiarTarifa() {
		if(this.tipo_tarifa == 1) {
			this.setTipo_tarifa(2);
			this.setPrecio_bandera(70);
			System.out.println("Cambio de tarifa exitoso !");
		}else{
			this.setTipo_tarifa(1);
			this.setPrecio_bandera(58);
			System.out.println("Cambio de tarifa exitoso !");
		}
	}
	
	public double totalPagar(int metros) {
		if(this.tipo_tarifa == 1) {
			return this.precio_bandera + metros * 5;
		}else {
			return this.precio_bandera + metros * 8;
		}
	} 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Taxi mi_taxi = new Taxi(123, 10, 1);
		
		System.out.println(mi_taxi.getPrecio_bandera());
		
		double total = mi_taxi.totalPagar(10);
		
		System.out.println("El total es de: $"+ total);
		
		mi_taxi.cambiarTarifa();
		
		System.out.println(mi_taxi.getPrecio_bandera());
		
		double total2 = mi_taxi.totalPagar(10);
		
		System.out.println("El total es de: $"+ total2);
		

	}

}
