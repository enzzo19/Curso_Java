package model.herencia;

public class HerenciaAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Perro mi_perrito = new Perro(6, 35, "Doby", "callejero", 4, 2 );
		
		mi_perrito.gritar();
		
		Gato mi_gatito = new Gato(3, 25, "Biscocho", "Siames", 6, 4, "Verde", "Macho");
		
		mi_gatito.gritar();
		
		String alimento = "pequeño";
		
		System.out.println(mi_gatito.puedeSaltar(150));
		
		System.out.println(mi_gatito.puedeComer(alimento));
		

	}

}
