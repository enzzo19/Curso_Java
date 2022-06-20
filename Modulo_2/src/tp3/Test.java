package tp3;

import java.util.ArrayList;
public class Test {
    public static void main(String[] args) {
        Manzana Manzana = new Manzana(0.200);
        Pera Pera = new Pera(0.500);
        Naranja Naranja = new Naranja(0.260);

        ArrayList <Fruta> ListaFruta = new ArrayList <Fruta>() ;

        ListaFruta.add(Manzana);
        ListaFruta.add(Pera);
        ListaFruta.add(Naranja);
        /*
        double jugoMan = ListaFruta.get(0).hacerJugo();

        double jugoPera = ListaFruta.get(1).hacerJugo();

        double jugoNar = ListaFruta.get(2).hacerJugo();

        System.out.println("Jugo de manzana obtenido: "+ String.format("%.3f", jugoMan)+ " L");//0.06 debe ser
        System.out.println("Jugo de Pera obtenido: "+ String.format("%.3f", jugoPera) + " L");//0.3 debe ser
        System.out.println("Jugo de Naranja obtenido: "+ String.format("%.3f", jugoNar) + " L");//0.208 debe ser
    */
        double cant_jugo_total = 0;
        for (int i = 0; i < ListaFruta.size(); i++) {
			
        	System.out.println("Jugo de "+ListaFruta.get(i).getNombre()  +" obtenido: "+ String.format("%.3f", ListaFruta.get(i).hacerJugo())+ " L");
        	cant_jugo_total += ListaFruta.get(i).hacerJugo();
		}  
       
       System.out.println("Cant Total jugo obtenido: "+ String.format("%.3f", cant_jugo_total) + " L");
    }
}
