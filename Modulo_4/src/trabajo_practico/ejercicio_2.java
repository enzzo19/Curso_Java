package trabajo_practico;

// PASO1: Importar paquetes requeridos
import java.sql.*;

public class ejercicio_2 {
	
	//  Registrar JDBC Driver
	// JDBC nombre del driver y URL de la BDD
		 static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; 
		 static final String DB_URL = "jdbc:mysql://localhost:3306/world";
	 // Credenciales de la BDD
		 static final String USER = "root";
		 static final String PASS = "123456789aA#987654321";

	public static void main(String args[]) {
		 Connection conn = null;
		 Statement stmt = null;
		 Statement stmt2 = null;
		 Statement stmt3 = null;
		 
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
		 stmt3 = conn.createStatement();
		 String sql;
		 sql = "SELECT Name, Code, Population FROM country";
		 ResultSet rs = stmt.executeQuery(sql);
		 
		 sql= "SELECT SurfaceArea FROM country";
		 ResultSet rs3 = stmt3.executeQuery(sql);
		 
		 sql = "SELECT CountryCode, Language FROM countrylanguage";
		 ResultSet rs2 = stmt2.executeQuery(sql);
		 
		 //STEP 5: Extraer datos del ResultSet
		 while(rs.next() && rs2.next()){
		 //Recibir por tipo de columna
		 int population = rs.getInt("Population");
		 String Name = rs.getString("Name");
		 String CountryCode = rs.getString("Code");
		 String idioma = rs2.getString("Language");
		 //Mostrar Valores
		 //Mostrar Valores
		 System.out.println(CountryCode + ": " + Name +" "+population + " habitantes hablando en: " + idioma);
		 }
		 while(rs3.next()){
			 //Recibir por tipo de columna
			 double area = rs3.getDouble("SurfaceArea");
			 
			 System.out.println("Surface Area " + area);
			 }
		 
		 //PASO6: Entorno de Limpieza
		 rs.close();
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
