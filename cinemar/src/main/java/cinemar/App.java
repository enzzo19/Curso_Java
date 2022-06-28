package cinemar;

import com.google.gson.Gson;
import static spark.Spark.*;

import org.apache.log4j.PropertyConfigurator;

public class App{
   public static void main(String[]args){
	   String log4jConfPath = "C:/Users/enzzo/eclipse-workspace/Curso_Java/supermark/to/log4j.properties";
	   PropertyConfigurator.configure(log4jConfPath);
       Gson mapper= new Gson();
       // port(8080);
       get("/saludo", (req,res) -> new Persona("Gabriel","Silvestre"), mapper::toJson);
   }
} 
