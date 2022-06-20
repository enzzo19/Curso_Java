package ejemplos_teoria;
import java.util.ArrayList;
import java.util.Scanner;
public class ejemplo {
	public static void main(String[] args) 
    {    String palabra="",palindromo="";
        ArrayList <String> auxiliar= new ArrayList <String>();
        Scanner entrada=new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        palabra=entrada.nextLine();
        for (int i=0;i<palabra.length();i++) 
        {    auxiliar.add(0,palabra.substring(i,i+1));}
        for (int i=0;i<auxiliar.size();i++) 
        {    palindromo=palindromo+auxiliar.get(i);}
        if (palabra.equals(palindromo)) 
        {    System.out.println("La palabra ingresada es un palindromo");}
        else 
        {    System.out.println("La palabra ingresada no es un palindromo:");}
    }
}
