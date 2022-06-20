package trabajo_pratico;

public class variante_ejercicio_2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		int num =0;
		
		while((num < 96) || (num > 122)){
			if(num !=13 && num !=10) {
				System.out.println("Ingrese una Letra minuscula: ");
			}
			num = System.in.read();
		}
		
		System.out.println("La letra ingresada es: "+ (char) num);

	}

}
