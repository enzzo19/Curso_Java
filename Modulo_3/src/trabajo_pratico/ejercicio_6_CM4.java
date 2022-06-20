package trabajo_pratico;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class ejercicio_6_CM4 {
    public static File Constructor_1(){
        // Crea un Objeto File asociado al fichero "fichero.txt" que se encuentra en el directorio de trabajo:
        File fichero = new File("numNaturales.txt"); //=>> "Fichero.txt se llama RUTA RELATIVA"
        //En este caso no se indica path. Se supone que el fichero se encuentra en el directorio actual de trabajo.
        //MOSTRAR EJEMPLO DE RUTA ABSOLUTA
        return fichero;
    }
    
    public static void escribir(String direccion) throws FileNotFoundException{
        FileWriter archivo = null;
        BufferedWriter texto = null;
        try{
            archivo = new FileWriter(direccion);
            texto = new BufferedWriter(archivo);
            
            System.out.println("Escribiendo los numeros del 1- 100...");
            for(int i = 1; i <= 100; i++) {
            	int a =(int)(Math. random()*100+1);
            	texto.write(a+"");
            	if((i % 10) == 0) {
            		texto.newLine();
            	}else {
            		texto.write(",");
            	}
            }
           
            texto.flush(); // guarda las modificaciones
            System.out.println("Fichero creado con exito ! :)");
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
        File fichero = Constructor_1();
        //File fichero = Constructor_2();
        //File fichero = Constructor_3();
        /*
        Debemos tener en cuenta que crear un objeto File no significa que deba existir el fichero o el directorio o que el path sea correcto.
        Si no existen no se lanzará ningún tipo de excepción ni tampoco serán creados.
        */
        if(!fichero.exists()){
            System.out.println("El fichero: '" + fichero.getName() + "' no existe");
            // exists() : comprueba si el fichero existe
            //getName() : devuelve el nombre del fichero q tiene asociado el objeto Fichero 
            /* CREAR FICHERO */
            System.out.println("Creando fichero.txt");
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

        /*Lectrura de un archivo*/
        // leer(fichero.getAbsolutePath());

        /*Escritura de un archivo*/
        //↓ borrar (//) para poder ejecutar la función ESCRIBIR 
        escribir(fichero.getAbsolutePath());
    }
       
}
