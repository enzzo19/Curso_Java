package trabajo_pratico;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ejercicio_7 {
	
	public static File Constructor_1(){
        // Crea un Objeto File asociado al fichero "fichero.txt" que se encuentra en el directorio de trabajo:
        File fichero = new File("numNaturales.txt"); //=>> "Fichero.txt se llama RUTA RELATIVA"
        //En este caso no se indica path. Se supone que el fichero se encuentra en el directorio actual de trabajo.
        //MOSTRAR EJEMPLO DE RUTA ABSOLUTA
        return fichero;
    }
	
	public static void sumar(String direccion) throws FileNotFoundException{
        /* LEER FICHERO */
        FileReader archivo = null;
        BufferedReader texto = null;
        try{
            //var "direccion contiene el path de donde esta almacenado el archivo"
            archivo = new FileReader(direccion);
            texto = new BufferedReader(archivo);
            
            //
            String lectura ="";
            int linea = 1;
            System.out.println("El path del archivo es: "+ direccion);
            System.out.println("El resultado de las sumas es : ");
            while((lectura = texto.readLine()) != null){
              String [] fila = lectura.split(",");
              int suma = 0;
              for (int i = 0; i < fila.length; i++) {
            	  suma = suma + Integer.parseInt(fila[i]);
              }
              System.out.println("Linea Nro " + linea + " suma: " + suma);
              linea ++;
            }
            // System.out.println(lectura);
            
            //
        }catch(FileNotFoundException e){
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

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
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
            Lanza una excepci??n del tipo IOException. */
        }
		
		sumar(fichero.getAbsolutePath());
		
		}
	

}
