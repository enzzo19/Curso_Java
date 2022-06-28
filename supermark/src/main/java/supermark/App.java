package supermark;

import static spark.Spark.*;

import java.time.LocalDateTime;

import org.apache.log4j.PropertyConfigurator;
import com.google.gson.Gson;

public class App {
	 public static void main(String[]args){
		   String log4jConfPath = "C:/Users/enzzo/eclipse-workspace/Curso_Java/cinemar/to/log4j.properties";
		   PropertyConfigurator.configure(log4jConfPath);
	       Gson mapper= new Gson();
	       // port(8080);
	       //get("/datos_cliente", (req,res) -> new Usuario("Enzo","1234567890", "CLIENTE", "enzzo.juarez.19@gmail.com"), mapper::toJson);
	       	
			
	       get("/consulta", (req,res) ->  "La fecha de hoy es: " + LocalDateTime.now().toString());
	   }
}
