package BDD_auto_shop;

// PASO1: Importar paquetes requeridos
import java.sql.*;

public class table_employes {
	
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
//		 sql = "CREATE TABLE Employees (\r\n"
//		 		+ "    Id INT NOT NULL AUTO_INCREMENT,\r\n"
//		 		+ "    FName VARCHAR(35) NOT NULL,\r\n"
//		 		+ "    LName VARCHAR(35) NOT NULL,\r\n"
//		 		+ "    PhoneNumber VARCHAR(11),\r\n"
//		 		+ "    ManagerId INT,\r\n"
//		 		+ "    DepartmentId INT NOT NULL,\r\n"
//		 		+ "    Salary INT NOT NULL,\r\n"
//		 		+ "    HireDate DATE NOT NULL,\r\n"
//		 		+ "    PRIMARY KEY(Id),\r\n"
//		 		+ "    FOREIGN KEY (ManagerId) REFERENCES Employees(Id),\r\n"
//		 		+ "    FOREIGN KEY (DepartmentId) REFERENCES Departments(Id)\r\n"
//		 		+ ");";	
//		 stmt.executeUpdate(sql);
//		System.out.println("Tabla Creada con Exito");
		int i= 0;
		while(i < 5) {
			String nombre = "Jorgito";
		 sql = "INSERT INTO employees (FName, LName, PhoneNumber, ManagerId, DepartmentID, Salary, HireDate)\r\n"
		 		+ "VALUES (nombre, 'Smith', 1234567899, NULL, 1, 1000, '2002-01-01')"	;
		 stmt.executeUpdate(sql);
		 i++;
		 }
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
