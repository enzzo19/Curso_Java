
// PASO1: Importar paquetes requeridos
import java.sql.*;

public class ejercicio7a_CM4 {
	
	//  Registrar JDBC Driver
	// Hola esto es un ejemplo
	// JDBC nombre del driver y URL de la BDD
		 static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; 
		 static final String DB_URL = "jdbc:mysql://localhost:3306/universidad";
	 // Credenciales de la BDD
		 static final String USER = "root";
		 static final String PASS = "123456789aA#987654321";

	public static void main(String args[]) {
		 Connection conn = null;
		 Statement stmt = null;
		 
		 
		 try{
		 //PASO 2: Registrar JDBC driver
		 Class.forName(JDBC_DRIVER);
		 
		 //PASO3: Abrir una Conexion
		 System.out.println("Connecting to database...");
		 conn = DriverManager.getConnection(DB_URL,USER,PASS);
		 
		 //PASO 4: Ejecutar una consulta SQL
		 System.out.println("Creating statement...");
		 stmt = conn.createStatement();
		 String sql;
		 sql = "SELECT * FROM persona where (sexo = 'M')";
		 ResultSet rs = stmt.executeQuery(sql);
		 System.out.println("Valores OBTENIDOS con exito :) !");
		 
		 
		 //Paso 5 
		 System.out.println("Nombre de las personas que son Mujeres");
		 while(rs.next()) {
			 String nombre = rs.getString("nombre");
			 String apellido = rs.getString("apellido1");
			 
			 System.out.println(nombre + " " + apellido);
		 }
		 
		 //PASO6: Entorno de Limpieza
		 stmt.close();
		 conn.close();
		 }catch(SQLException se){
			 // Resolver errores para JDBC
			 se.printStackTrace();
		 }catch(Exception e){
			 // Resolver errores para Class.forName
			 e.printStackTrace();
		 }finally{
		 // Bloque finalmente utilizado para cerrar recursos
		 try{
			 if(stmt!=null)
				 stmt.close();
		 }catch(SQLException se2){
		 }// Nada que podamos hacer
		 try{
			 if(conn!=null)
				 conn.close();
		 }catch(SQLException se){
		 se.printStackTrace();
		 	} //cierra finally try
		 } //cierra try
		 System.out.println("Goodbye!");
		
	} // cierra metodo principal (main)

} // cierra clase
