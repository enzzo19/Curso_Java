package cinemar;

import com.google.gson.Gson;
import static spark.Spark.*;
import org.apache.log4j.PropertyConfigurator;

public class App{
   public static void main(String[]args){
	   String log4jConfPath = "C:/Users/enzzo/eclipse-workspace/Curso_Java/cinemar/to/log4j.properties";
	   PropertyConfigurator.configure(log4jConfPath);
       Gson mapper= new Gson();
       // port(8080);
       Clasificacion clasi = new Clasificacion(1, 14, "ESta pelicula es apta para mayores de +14 años");
       TipoPelicula tipo = new TipoPelicula(1, "Espanish", "3D", false);
       Pelicula mi_peli = new Pelicula(1, "Jurasick Park", "Aparecen dinosaurios", "accion_fantasia", "120", "Brad Pit", "Spilver", tipo, clasi);
       get("/info_pelicula", (req,res) -> mi_peli, mapper::toJson);
       get("/tipo_pelicula", (req,res) -> mi_peli.getId_tipo_pelicula(), mapper::toJson);
       get("/clasificacion_pelicula", (req,res) -> mi_peli.getId_clasificacion(), mapper::toJson);
   }
} 
