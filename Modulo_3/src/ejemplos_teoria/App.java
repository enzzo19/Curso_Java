package ejemplos_teoria;

class LecturaDeLinea {
    public static void main(String[] args) throws Exception {
        int c;
        int contador = 0;
        System.out.print("se lee hasta encontrar el fin de linea: ");
        while( (c = System.in.read() ) != '\n' )
        {
            contador++;
            System.out.println("lo que interpreta el compilador: "+  c );
            System.out.println("lo que ve la persona: "+ (char) c );
        }
        System.out.println(); // Se escribe el fin de linea
        System.err.println( "Contados "+ contador +" bytes en total." );
    }
}
