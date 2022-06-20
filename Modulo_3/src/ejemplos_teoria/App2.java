package ejemplos_teoria;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class LecturaDeLinea2 {
    public static void main(String[] args) throws Exception {
        String c;
        System.out.print("se lee hasta encontrar el fin de linea: ");
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(entrada);
        c = teclado.readLine();
        System.err.println( "Contados "+ c.length() +" bytes en total." );
    }
}
