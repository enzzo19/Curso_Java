package ejemplos_teoria;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <String, Integer>  edades = new HashMap<String, Integer>();
		
		System.out.println(edades);
		System.out.println(edades.isEmpty());
		
		edades.put("Enzo", 21);
		edades.put("Jorgelina", 20);
		edades.put("Fabrizio", 19);
		edades.put("Norma", 50);

		
		System.out.println(edades.isEmpty());
		
		// System.out.println(paises.get("2"));  //Extraer un elemento con su clave
		System.out.println(edades);
		edades.remove("Norma");
		// System.out.println(paises);
		System.out.println(edades.size());
		
		//Cumpleños de Fabrizio
		System.out.println();
		for (String i : edades.keySet()) {
		  	System.out.println("Clave: " + i + " Valor: " + edades.get(i));
		  	
		  	if (i.equals("Fabrizio")){
		  		
		  	}
		 }
		
		System.out.println(edades);
		
		edades.clear();
		
		System.out.println(edades);

	}

}
