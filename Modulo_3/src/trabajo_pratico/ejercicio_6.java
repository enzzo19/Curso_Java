package trabajo_pratico;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ejercicio_6 {
	public static File Constructor_1(){
        // Crea un Objeto File asociado al fichero "fichero.txt" que se encuentra en el directorio de trabajo:
        File fichero = new File("C:/Users/enzzo/OneDrive/Escritorio/numNaturales.txt"); //=>> "Fichero.txt se llama RUTA RELATIVA"
        //En este caso no se indica path. Se supone que el fichero se encuentra en el directorio actual de trabajo.
        //MOSTRAR EJEMPLO DE RUTA ABSOLUTA
        return fichero;
    }
	
	public static void escribir (String direccion) throws Exception{
		FileWriter archivo = null;
        BufferedWriter texto = null;
        try{
            archivo = new FileWriter(direccion);
            texto = new BufferedWriter(archivo);
            System.out.println("Cargando los Numeros Naturales...");
            for (int i = 1; i < 101; i++) {
            	texto.write(i+"");
            	if((i % 10) == 0) {
            		texto.newLine();
            	}else {
            		texto.write(" ");
            	}
            }
            texto.flush();
            System.out.println("Fichero creado con exito !!");
        }
        catch(FileNotFoundException e){
            System.out.println("archivo no encontrado");// muestra un msj de error si no 
                                                          // encuentra el archivo

        }catch(IOException e){
            System.out.println("Error! "+e.getMessage());// muestra un msj de error si no 
                                                         // puede abrir el archivo
        }
        finally{
            try{ //cerramos los flujos abiertos
                texto.close();
                archivo.close();
            }catch(IOException e){
                System.out.println("Error! "+e.getMessage());
            }
        }
    }
	
	public static void main (String args[]) throws Exception {
		File fichero = Constructor_1();
		
		if(!fichero.exists()){
            System.out.println("El fichero: '" + fichero.getName() + "' no existe");
            // exists() : comprueba si el fichero existe
            //getName() : devuelve el nombre del fichero q tiene asociado el objeto Fichero 
            /* CREAR FICHERO */
            System.out.println("Creando fichero_1.txt");
            if(fichero.createNewFile()){
                //Crea un fichero sin datos
                System.out.println(fichero.getName()+" creado con exito!!!");
            }else{
                System.out.println("No se ha podido crear " + fichero.getName());
            }
            /* Devuelve true si se ha podido crear. 
            Para poder crearlo el fichero NO DEBE EXISTIR.
            Lanza una excepción del tipo IOException. */
        }
		
		escribir(fichero.getAbsolutePath());
		
	}

}