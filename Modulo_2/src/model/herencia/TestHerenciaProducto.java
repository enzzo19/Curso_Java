package model.herencia;

public class TestHerenciaProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Producto6 mi_producto = new Producto6(123456, "Galletas", 120, 50, 500, "Oreo");	
		mi_producto.mostrar();
		
		System.out.println();
		ProductoEnvasado mi_envasado = new ProductoEnvasado(3456,"Arroz", 170, 20, 200, "Gallo", "Bolsa");
		
		mi_envasado.mostrar();
		
		System.out.println();
		
		ProductoLacteo mi_lacteo = new ProductoLacteo(3456,"Yogurt", 190, 25, 250, "Serenisima", 0.6, -3);
		
		mi_lacteo.mostrar();
	}

}
