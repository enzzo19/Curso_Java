package cinemar;

import static spark.Spark.get;
import java.util.Date;
import java.sql.*;
import org.json.JSONObject;

import com.google.gson.Gson;

import java.util.ArrayList;

import org.apache.log4j.PropertyConfigurator;
import org.json.JSONException;

public class JsonUsuario_2 {
	
	static //  Registrar JDBC Driver
	// JDBC nombre del driver y URL de la BDD
		Credenciales mi_credi = new Credenciales();
		 static final String JDBC_DRIVER = mi_credi.JDBC_DRIVER; 
		 static final String DB_URL = mi_credi.DB_URL;
	 // Credenciales de la BDD
		 static final String USER = mi_credi.USER;
		 static final String PASS = mi_credi.PASS;

	public static void main(String args[]) {
		 Connection conn = null;
		 Statement stmt = null;
		 JSONObject jo = new JSONObject();
		 ArrayList<Usuario> mis_usuarios = new ArrayList();
		 
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
		 sql = "SELECT id_usuario,nombre,apellido,esAdministrador,email,fecha_nacimiento,dni FROM Usuario;";
		 ResultSet rs = stmt.executeQuery(sql);
		 
		 //STEP 5: Extraer datos del ResultSet
		 while(rs.next()){
		 //Recibir por tipo de columna
			 int id_usuario = rs.getInt("id_usuario");
			 String nombre = rs.getString("nombre");
			 String apellido = rs.getString("apellido");
			 boolean esAdministrador = rs.getBoolean("esAdministrador");
			 String email = rs.getString("email");
			 Date fecha_nacimiento = rs.getDate("fecha_nacimiento");
			 String dni = rs.getString("dni");
			 System.out.println("id_usuario: "+ id_usuario + " nombre: " + nombre + " apellido: " + apellido + " esAdministrador: " +esAdministrador+" email: " +email+" fecha_nacimiento: " +fecha_nacimiento+" dni: " +dni);
			 
			 Usuario mi_usuario = new Usuario(id_usuario, nombre, apellido, esAdministrador, email, fecha_nacimiento, dni);
			 mis_usuarios.add(mi_usuario); 
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
		  String log4jConfPath = mi_credi.path + "/cinemar/to/log4j.properties"; //cambiar el path
		   PropertyConfigurator.configure(log4jConfPath);
		  String json = new Gson().toJson(mis_usuarios);
	      get("/usuario", (req,res) -> json);
		 System.out.println("Goodbye!");
		 
	} // cierra metodo principal (main)

} // cierra clase