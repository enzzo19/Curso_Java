import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 * 
 * @author enzzo ------> Comentario de autor o documentacion
 * 
 */

public class Repaso1 {     // ------> Definicion de la clase
	public static void main (String args []) {    //  -------> Definicion del metodo principal
		int dato;

		dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entre 1-5: "));

		switch (dato) {
		case 1:
			JOptionPane.showMessageDialog(null, "ingreso el numero 1");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "ingreso el numero 2");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "ingreso el numero 3");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "ingreso el numero 4");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "ingreso el numero 5");
			break;
		default:
			JOptionPane.showMessageDialog(null, "no esta en el rango de numeros");
			break;
		}


		
		
	}

}
