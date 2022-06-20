package practico3;
import java.util.Scanner;
public class ejercicio16 {
	public static void main(String args[]) {
		char opcion;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Nuestras Opciones: A)INICIO - B)DASHBOARD - C)HOME - D)PANEL");
		System.out.println();
		System.out.println("Ingresa una Opcion(con numero): ");
		opcion = entrada.next().charAt(0);
		
		switch (opcion) 
        {
            case 'A':  System.out.println("Tu eleccion fue: INICIO");
                	break;
            case 'B':  System.out.println("Tu eleccion fue: DASHBOARD");
                     break;
            case 'C':  System.out.println("Tu eleccion fue: HOME");
                     break;
            case 'D':  System.out.println("Tu eleccion fue: PANEL");
                     break;
            default: System.out.println("ERROR");
                     break;
        }
	}

}
