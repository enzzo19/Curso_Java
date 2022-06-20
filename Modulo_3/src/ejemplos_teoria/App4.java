package ejemplos_teoria;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.ArrayList;
import java.util.Stack;

class listas2 {

    public static void lista(){
        List<String> list = new ArrayList<String>();

        // Añadimos elementos
        list.add("Luis");
        list.add("Marta");
        list.add("Julio");
        System.out.println(list);
        list.add(1, "Jose");
        System.out.println(list);
//        list.remove(0);
//        list.remove(0);
//        list.remove(0);
//        list.remove(0);
//        System.out.println(list);
        // Obtenemos un Iterador y recorremos la lista.
        //Iterator<String> lista = new list.iterator();
        
        Iterator<String> iter = list.iterator();
        System.out.println(iter.hasNext());
        System.out.println(iter.next());
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }

    public static void cola(){
        Queue<String> cola = new LinkedList<>();
        
        
        // Añadi clientes a mi banco
        cola.add("Pedro");
        System.out.println(cola);
        cola.add("Juan");
        System.out.println(cola);
        cola.add("Jose");
        System.out.println(cola);
        cola.add("Carlitos");
        System.out.println(cola);
        System.out.println("El que sigue en ser atendido/a es: " + cola.peek());
        System.out.println(cola);
        System.out.println("El que estoy atediendo es: " + cola.poll());
        System.out.println(cola);
        cola.add("Lucas");
        System.out.println(cola);
        
        
        
        
//        System.out.println(cola);
//        System.out.println("Agregando valores");
//        for (int i = 0; i < 5; i++) {
//            cola.add(i);
////            System.out.println(cola);
//        }
//        
//        System.out.println("\nTamaño Inicial de la cola: " + cola.size());
//        System.out.println("\nRetirando valores");
//        while (!cola.isEmpty()) {
//            System.out.println("Valor: " + cola.poll());
//            System.out.println(cola);           
//        }
//        System.out.println("Tamaño final de la cola: " + cola.size());
    }

    public static void pila(){
        Stack<String> pila = new Stack<>();
        //System.out.println(pila.isEmpty());
        
        pila.push("Informe_000");
        pila.push("Informe_001");
        pila.push("Informe_002");
        pila.push("Informe_003");
        System.out.println(pila);
        
        //System.out.println(pila.isEmpty());
        
        System.out.println("Informe  a revisar: " + pila.peek());
        
        System.out.println(pila);
        
        System.out.println("Informe revisado: " + pila.pop());
        
        System.out.println(pila);
        
        
//        System.out.println("Agregando valores");
//        for (int i = 0; i < 5; i++) {
//            pila.push(i);
//            System.out.println(pila);
//        }
//        System.out.println("\nTamaño Inicial de la pila: " + pila.size());
//        System.out.println("\nRetirando valores");
//        while (!pila.isEmpty()) {
//            System.out.println("Valor: " + pila.pop()); 
//            System.out.println(pila);           
//        }
//        System.out.println("Tamaño final de la pila: " + pila.size());
    }
    public static void main(String[] args) throws Exception {
        //lista();
        //cola();
        pila();
    }
       
}