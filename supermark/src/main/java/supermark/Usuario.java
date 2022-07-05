package supermark;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class Usuario {
	private int id_usuario;
	private String nombre;
	private boolean esAdministrador;
	private String clave;
	
	public Usuario() {
		
	}
	
	public Usuario(int id_usuario, String nombre, boolean esAdministrador, String clave) {
		super();
		this.id_usuario = id_usuario;
		this.nombre = nombre;
		this.esAdministrador = esAdministrador;
		this.clave = clave;
	}
	
	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public boolean isEsAdministrador() {
		return esAdministrador;
	}

	public void setEsAdministrador(boolean esAdministrador) {
		this.esAdministrador = esAdministrador;
	}

	public static void modifica_admin(){
		 //  Registrar JDBC Driver
		// JDBC nombre del driver y URL de la BDD
			Credenciales mi_credi = new Credenciales();
			String JDBC_DRIVER = mi_credi.JDBC_DRIVER; 
			String DB_URL = mi_credi.DB_URL;
		 // Credenciales de la BDD
			String USER = mi_credi.USER;
			String PASS = mi_credi.PASS;
			
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
			 sql = "UPDATE Usuarios SET administrador = false WHERE idUsuario = 2";
			 stmt.executeUpdate(sql);
			 
			 System.out.println("Valores ACTUALIZADOS con exito :) !");
			 
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
		
	}
	
}
	