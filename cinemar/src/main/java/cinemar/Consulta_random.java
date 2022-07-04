package cinemar;

import static spark.Spark.get;

import java.sql.*;
import org.json.JSONObject;

import com.google.gson.Gson;

import org.apache.log4j.PropertyConfigurator;
import org.json.JSONException;

public class Consulta_random {
	
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
		 Statement stmt2 = null;
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
		 stmt2 = conn.createStatement();
		 String sql;
		 sql = "SELECT * \r\n"
		 		+ "FROM Pelicula E\r\n"
		 		+ "JOIN Tipo_Pelicula D\r\n"
		 		+ "ON E.id_Tipo_Pelicula = D.id_Tipo_Pelicula;";
		 ResultSet rs = stmt.executeQuery(sql);
		 
		 sql = "SELECT * FROM Pelicula E JOIN Clasificacion D ON E.id_clasificacion = D.id_clasificacion;";
		ResultSet rs2 = stmt2.executeQuery(sql);		 
	
		 
		 
		 //STEP 5: Extraer datos del ResultSet
		 while(rs.next() && rs2.next()){
		 //Recibir por tipo de columna
			 int id_pelicula = rs.getInt("id_pelicula");
			 String titulo_Pelicula = rs.getString("titulo_Pelicula");
			 String sinopsis = rs.getString("sinopsis");
			 String genero = rs.getString("genero");
			 String duracion = rs.getString("duracion");
			 String actores = rs.getString("actores");
			 String director = rs.getString("director");
			 int id_Tipo_Pelicula = rs.getInt("id_Tipo_Pelicula");
			 int id_clasificacion = rs.getInt("id_clasificacion");
			 String identificador = rs2.getString("identificador");
			 String descripcion = rs2.getString("descripcion");
			 
			 System.out.println("id_pelicula: "+ id_pelicula + " titulo_Pelicula: " + titulo_Pelicula + " sinopsis: " + sinopsis + " genero: " +genero + " duracion: " + duracion + " actores: " + actores + " director: " + director + "id_Tipo_Pelicula: "+ id_Tipo_Pelicula +  "id_clasificacion: "+ id_clasificacion);
			 
			 jo.put("id_pelicula", id_pelicula);
			 jo.put("titulo_Pelicula", titulo_Pelicula);
			 jo.put("sinopsis", sinopsis);
			 jo.put("genero", genero);
			 jo.put("duracion", duracion);
			 jo.put("actores", actores);
			 jo.put("director", director);
			 jo.put("id_Tipo_Pelicula", id_Tipo_Pelicula);
			 jo.put("id_clasificacion", id_clasificacion);
			 jo.put("identificador", identificador);
			 jo.put("descripcion", descripcion);
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
	      get("/pelicula", (req,res) -> jo);
		 System.out.println("Goodbye!");
		 
	} // cierra metodo principal (main)

} // cierra clase