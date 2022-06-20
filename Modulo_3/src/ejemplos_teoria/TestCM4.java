package ejemplos_teoria;

import java.util.HashMap;

public class TestCM4 {
	public static void main(String args[]) {
		HashMap <String, String> paises = new HashMap<String,String>();
		
		System.out.println(paises);
		paises.put("ARS", "Argentina");
		paises.put("BLV", "Bolivia");
		paises.put("BRZ", "Brazil");
		paises.put("PGY", "Paraguay");
		
		System.out.println(paises);
		
		System.out.println(paises.get("78"));
		
		//paises.remove("BRZ");
		//System.out.println(paises);
		
		System.out.println("El tamaño de tu HashMap es de : " + paises.size());
		
		System.out.println("Claves de mi HashMap: ");
		for(String key: paises.keySet()) {
			System.out.println(key);
		}
		
		System.out.println("Valores de mi HashMap: ");
		for (String value: paises.values()) {
			System.out.println(value);
		}
		
		System.out.println("Valores y Claves en mi HashMap");
		
		for(String key: paises.keySet()) {
			System.out.println("Clave: " + key + "| Valor : " + paises.get(key));
			
		}
		
		//paises.clear();
		
		//System.out.println(paises);
		
		paises.replace("PGY", "Polonia");
		
		System.out.println("Valores y Claves en mi HashMap");
		
		for(String key: paises.keySet()) {
			System.out.println("Clave: " + key + "| Valor : " + paises.get(key));
			
		}
		
	}

}
