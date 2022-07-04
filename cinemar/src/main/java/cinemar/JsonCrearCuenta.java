package cinemar;

import static spark.Spark.get;
import java.util.Date;
import java.sql.*;
import org.json.JSONObject;

import com.google.gson.Gson;

import org.apache.log4j.PropertyConfigurator;
import org.json.JSONException;

public class JsonCrearCuenta {
	
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
		 sql = "SELECT id_crearCuenta,nombre,apellido,dni,fechaNacimiento,nombreUsuarioFicticio,contrasenia,confirmarContrasenia,email,genero,complejoHabitual,id_usuario FROM crearcuenta;";
		 ResultSet rs = stmt.executeQuery(sql);
		 
		 //STEP 5: Extraer datos del ResultSet
		 while(rs.next()){
		 //Recibir por tipo de columna
			 int id_crearCuenta = rs.getInt("id_crearCuenta");
			 String nombre = rs.getString("nombre");
			 String apellido = rs.getString("apellido");
			 String dni = rs.getString("dni");
			 Date fechaNacimiento = rs.getDate("fechaNacimiento");
			 String nombreUsuarioFicticio = rs.getString("nombreUsuarioFicticio");
			 String contrasenia = rs.getString("contrasenia");
			 String confirmarContrasenia = rs.getString("confirmarContrasenia");
			 String email = rs.getString("email");
			 String genero = rs.getString("genero");
			 String complejoHabitual = rs.getString("complejoHabitual");
			 int id_usuario = rs.getInt("id_usuario");
			 
			 
			 System.out.println("id_crearCuenta: "+ id_crearCuenta + " nombre: " + nombre + " apellido: " + apellido + " dni: " +dni+" fechaNacimiento: " + fechaNacimiento+ " nombreUsuarioFicticio: " + nombreUsuarioFicticio+ " contrasenia: " + contrasenia+ " confirmarContrasenia: " + confirmarContrasenia  +" email: " +email+ " genero: " + genero +" complejoHabitual: " +complejoHabitual+" id_usuario: " +id_usuario);
			 
			 jo.put("id_crearCuenta", id_crearCuenta);
			 jo.put("nombre", nombre);
			 jo.put("apellido", apellido);
			 jo.put("dni", dni);
			 jo.put("fechaNacimiento", fechaNacimiento);
			 jo.put("nombreUsuarioFicticio", nombreUsuarioFicticio);
			 jo.put("contrasenia", contrasenia);
			 jo.put("confirmarContrasenia", confirmarContrasenia);
			 jo.put("email", email);
			 jo.put("genero", genero);
			 jo.put("complejoHabitual", complejoHabitual);
			 jo.put("id_usuario", id_usuario);
			 System.out.println(jo);
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
		  String log4jConfPath = "C:/Users/enzzo/eclipse-workspace/Curso_Java/cinemar/to/log4j.properties"; //cambiar el path
		   PropertyConfigurator.configure(log4jConfPath);
	       Gson mapper= new Gson();
	      get("/crearcuenta", (req,res) -> jo);
		 System.out.println("Goodbye!");
		 
	} // cierra metodo principal (main)

} // cierra clase