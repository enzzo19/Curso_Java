package practico3;
import java.util.Scanner;
public class ejercicio8 {
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);
        int n=5;
        String[] lista = new String[n];
        ingreso(lista);
        System.out.println("Ingrese un nombre cualquiera: ");
        String nombre = lect.nextLine();
        //MUESTRA
       
         for(int i=0;i<n;i++){
           System.out.print(lista[i]+ "  ");
         }
        int pos = busqueda(lista, nombre);
        if(pos == -1){
            System.out.println("El nombre no se encontro :(");
        }
        else{
            System.out.println("Nombre encontrado!!!");
        }
        
    }
    public static void ingreso(String [] list) {
        Scanner lectura = new Scanner(System.in);

        for (int i = 0; i<list.length ; i++){
            System.out.println("Ingrese un nombre: ");
            list[i] = lectura.nextLine();
        }
    }
    
    public static int busqueda(String []lista, String buscado){
        int pos = -1;
        System.out.println("El que quiero encontras es: " + buscado);
        for(int i=0; i<lista.length; i++){
        	System.out.println("El elemento que comparo es: " + lista[i]);
            if(buscado.equals(lista[i])){ //importante usar metodo .equals y no el == para comparar Strings.
            	System.out.println("Entre");
            	pos = i;
            }
        }
        return pos;
    }
}

