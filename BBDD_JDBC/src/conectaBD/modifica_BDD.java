package conectaBD;
import java.sql.*;
public class modifica_BDD {
	public static void main(String[] args) {
		
		try {
			
			//1_ CREAR LA CONEXION
			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "123456789aA#987654321");
			
			//2_ CREAR OBJETO STATEMENT
			Statement miStatement = miConexion.createStatement();
			
			String instruccionsql = "a";
		}catch(Exception e){
			
			System.out.println("No conecta");
			e.printStackTrace();
		
		}
		
	}
}
