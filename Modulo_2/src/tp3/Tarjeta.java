package tp3;

public class Tarjeta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TCredito JPTarjeta= new TCredito("666","JPerez","BcoPatagonia",2000,10000);
		TCredito DMTarjeta=new TCredito("777","DMartin","BcoGalicia",5000,10000);
		//JPTarjeta.muestraDatos();
		
		//System.out.println();
		/*
		  if (JPTarjeta.puedoComprar(16000)){
		 
			System.out.println("Si lo puedes comprar");
		}else {
		System.out.println("No puedes comprar el articulo");
		}
		
		*/
		
		//JPTarjeta.aumentarLimite(3000);
		
		//JPTarjeta.muestraDatos();
		
		
		// Punto d
		
		DMTarjeta.muestraDatos();
		
		DMTarjeta.pagarTarjeta(1500);
		
		System.out.println();
		
		DMTarjeta.muestraDatos();
		
		
	}

}
