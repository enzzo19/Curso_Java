package supermark;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class supermark {
	
	
	public static void main(String args[]) {
		
		
		// Modifica el estado de los administradores enla tabla usuarios
		// Usuario.modifica_admin(7, false);
		
		
		// Elimina un Usuario de la tabla usuarios
		// Usuario.elimina_usuario(2);
		
		
		// Inserta Valores en 2 tablas
		Usuario.inserta_usuario_producto("'Pedrito'", "'12345678'", true, 125, 100, "'Perfumeria'");
		
		
		// Funcion de login de usuario
		//String nombre = "enzzo19";
		//String contraseņa = "1234567890";
			
		//if(Usuario.login("'Fabri'", "34343434")) {
		//	System.out.println("Ingreso Exitoso! ");
		//}else {
		//	System.out.println("Contraseņa Incorrecta! ");
		//}
		
		
		// Validacion de un nuevo nombre de usuario en el sistema
		//System.out.println(Usuario.validacion_nombre_usuario("enzzo19"));
		
		//System.out.println(Usuario.valida_contraseņa("asdASD123*"));
	
	}

}
