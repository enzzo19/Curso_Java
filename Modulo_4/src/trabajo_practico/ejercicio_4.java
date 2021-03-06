package trabajo_practico;

// PASO1: Importar paquetes requeridos
import java.sql.*;

public class ejercicio_4 {
	
	//  Registrar JDBC Driver
	// JDBC nombre del driver y URL de la BDD
		 static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; 
		 static final String DB_URL = "jdbc:mysql://localhost:3306/universidad";
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

		 String sql = "INSERT INTO persona\r\n"
                 + "VALUES\r\n"
                 + "    (100, '26902806M', 'Salvador', 'S?nchez', 'P?rez', 'Salta', 'C/ Calle 123', '387456985', '1994/10/20', 'H', 'alumno'),\r\n"
                 + "    (101, '89542419S', 'Juan', 'Vega', 'Gea', 'Rosario de lerma', 'C/ Calle 124', '387456321', '1995/04/28', 'M', 'alumno'),\r\n"
                 + "    (102, '11105554G', 'Tomas', 'Bayer', 'Spencer', 'Salta', 'C/ Calle 125', '387456387', '1997/01/13', 'H', 'alumno'),\r\n"
                 + "    (103, '17105885A', 'Jos?', 'Lakin', 'Lemke', 'Cerrillos', 'C/ Calle 126', '387459872', '2000/08/05', 'M', 'profesor')\r\n"
                 + ";";

			 stmt.executeUpdate(sql);
			System.out.println("Valores Insertados con Exito");
		 
		
		 
		 //PASO6: Entorno de Limpieza
		
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
