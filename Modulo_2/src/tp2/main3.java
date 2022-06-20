package tp2;

public class main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Producto mi_producto = new Producto(123, "Oreo", "Galletas", 120, 100);
		System.out.println(mi_producto.getStock());
		
		mi_producto.vender("galletas", 10);
		
		System.out.println(mi_producto.getStock());

	}

}
