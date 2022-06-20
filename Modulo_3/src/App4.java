import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.ArrayList;
import java.util.Stack;

class listas {

    public static void lista(){
        List<String> list = new ArrayList<String>();

        // Añadimos elementos
        list.add("Luis");
        list.add("Marta");
        list.add("Julio");

        // Obtenemos un Iterador y recorremos la lista.
        //Iterator<String> lista = new list.iterator();
        Iterator<String> iter = list.iterator();
        while (iter.hasNext())
            System.out.println(iter.next());
    }

    public static void cola(){
        Queue<Integer> cola = new LinkedList<>();
        System.out.println("Agregando valores");
        for (int i = 0; i < 5; i++) {
            cola.add(i);
            System.out.println("Valor: " + i);
        }
        System.out.println("\nTamaño Inicial de la cola: " + cola.size());
        System.out.println("\nRetirando valores");
        while (cola.peek()!=null) {
            System.out.println("Valor: " + cola.poll());
            System.out.println("Tamaño actual de la cola: " + cola.size());            
        }
        System.out.println("Tamaño final de la cola: " + cola.size());
    }

    public static void pila(){
        Stack<Integer> pila = new Stack<>();
        System.out.println("Agregando valores");
        for (int i = 0; i < 5; i++) {
            pila.push(i);
            System.out.println("Valor: " + i);
        }
        System.out.println("\nTamaño Inicial de la pila: " + pila.size());
        System.out.println("\nRetirando valores");
        while (!pila.isEmpty()) {
            System.out.println("Valor: " + pila.pop()); 
            System.out.println("Tamaño actual de la pila: " + pila.size());           
        }
        System.out.println("Tamaño final de la pila: " + pila.size());
    }
    public static void main(String[] args) throws Exception {
        //lista();
        //cola();
        pila();
    }
       
}