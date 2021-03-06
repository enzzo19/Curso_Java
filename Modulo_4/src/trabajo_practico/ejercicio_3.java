package trabajo_practico;

// PASO1: Importar paquetes requeridos
import java.sql.*;

public class ejercicio_3 {
	
	//  Registrar JDBC Driver
	// JDBC nombre del driver y URL de la BDD
		 static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; 
		 static final String DB_URL = "jdbc:mysql://localhost:3306/auto_shop";
	 // Credenciales de la BDD
		 static final String USER = "root";
		 static final String PASS = "123456789aA#987654321";

	public static void main(String args[]) {
		 Connection conn = null;
		 Statement stmt = null;
		 Statement stmt2 = null;

		 
		 try{
		 //PASO 2: Registrar JDBC driver
		 Class.forName(JDBC_DRIVER);
		 
		 //PASO3: Abrir una Conexion
		 System.out.println("Connecting to database...");
		 conn = DriverManager.getConnection(DB_URL,USER,PASS);
		 
		 //PASO 4: Ejecutar una consulta SQL
		 System.out.println("Creating statement...");
		 stmt = conn.createStatement();
		 stmt2 = conn.createStatement();

		 String sql;
		 sql = "SELECT FName, LName, Email FROM customers";
		 ResultSet rs = stmt.executeQuery(sql);
		 
		 sql = "SELECT Model, TotalCost FROM cars";
		 ResultSet rs2 = stmt2.executeQuery(sql);
		 
		
		 
		 //STEP 5: Extraer datos del ResultSet
		 while(rs.next()){
		 //Recibir por tipo de columna
		 String fname = rs.getString("FName");
		 String lname = rs.getString("LName");
		 String email = rs.getString("Email");
		 //Mostrar Valores
		 System.out.println("Nombre: "+ fname + " " + lname + " Email: " + email);
		 }
		 
		 while(rs2.next()) {
			 String model = rs2.getString("Model");
			 int costo = rs2.getInt("TotalCost");
			 System.out.println("Modelo: " + model + " costo: $" + costo);
		 }
		 
		 
		 //PASO6: Entorno de Limpieza
		 rs.close();
		 rs2.close();
		 stmt.close();
		 stmt2.close();
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
