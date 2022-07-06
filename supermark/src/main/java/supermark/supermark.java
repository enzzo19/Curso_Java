package supermark;

public class supermark {
	
	
	public static void main(String args[]) {
		
		//Usuario.inserta_usuario("'Diego'", "34343434", true);
		
		String nombre = "enzzo19";
		String contraseña = "1234567890";
		
		
		
		System.out.println(Usuario.login("'" + nombre + "'", contraseña));
		
		//Usuario.elimina_usuario(5);
		
	}

}
