package conectaBD;
import java.sql.*;
public class Conecta_BDD {
	public static void main(String[] args) {
		
		try {
			
			//1_ CREAR LA CONEXION
			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "123456789aA#987654321");
			
			//2_ CREAR OBJETO STATEMENT
			Statement miStatement = miConexion.createStatement();
			
			//3_ EJECUTAR LA INSTRUCCION SQL
			//ResultSet miResultset =  miStatement.executeQuery("SELECT * FROM <nombre_tabla>");
			ResultSet miResultset =  miStatement.executeQuery("SELECT * FROM country");
			
			//4_ RECORRER EL RESULTSET
			int contador = 0;
			while(miResultset.next()) {
				
				contador ++;
				// System.out.println(miResultset.getString("<nombre_campo>") +" " + miResultset.getString("<nombre_campo>"));
				String resultado = miResultset.getString("Name");
				 System.out.println(resultado);
			}
			System.out.println("Cantidad de Paises: " + contador);
		}catch(Exception e){
			
			System.out.println("No conecta");
			e.printStackTrace();
		
		}
		
	}
}
