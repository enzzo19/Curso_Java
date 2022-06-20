package BDD_auto_shop;

// PASO1: Importar paquetes requeridos
import java.sql.*;

public class table_cars {
	
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
		 
		 try{
		 //PASO 2: Registrar JDBC driver
		 Class.forName(JDBC_DRIVER);
		 
		 //PASO3: Abrir una Conexion
		 System.out.println("Connecting to database...");
		 conn = DriverManager.getConnection(DB_URL,USER,PASS);
		 
		 //PASO 4: Ejecutar una sentencia SQL
		 System.out.println("Creating statement...");
		 stmt = conn.createStatement();
		 String sql;
		 sql = "CREATE TABLE Cars (\r\n"
		 		+ "    Id INT NOT NULL AUTO_INCREMENT,\r\n"
		 		+ "    CustomerId INT NOT NULL,\r\n"
		 		+ "    EmployeeId INT NOT NULL,\r\n"
		 		+ "    Model varchar(50) NOT NULL,\r\n"
		 		+ "    Status varchar(25) NOT NULL,\r\n"
		 		+ "    TotalCost INT NOT NULL,\r\n"
		 		+ "    PRIMARY KEY(Id),\r\n"
		 		+ "    FOREIGN KEY (CustomerId) REFERENCES Customers(Id),\r\n"
		 		+ "    FOREIGN KEY (EmployeeId) REFERENCES Employees(Id)\r\n"
		 		+ ");\r\n"
		 		+ "";	
		 stmt.executeUpdate(sql);
		System.out.println("Tabla Creada con Exito");
		
		sql = "INSERT INTO Cars\r\n"
				+ "VALUES\r\n"
				+ "    ('1', '1', '2', 'Ford F-150', 'READY', '230'),\r\n"
				+ "    ('2', '1', '2', 'Ford F-150', 'READY', '200'),\r\n"
				+ "    ('3', '2', '1', 'Ford Mustang', 'WAITING', '100'),\r\n"
				+ "    ('4', '3', '3', 'Toyota Prius', 'WORKING', '1254')\r\n"
				+ ";";	
		 stmt.executeUpdate(sql);
		System.out.println("Valores Insertados con Exito");
		 
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
