package ejemplos_teoria;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.ArrayList;
import java.util.Stack;

class listas {

    public static void lista(){
        List<String> list = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        // AÃ±adimos elementos
        list.add("Luis");
        list.add("Marta");
        list.add("Julio");
        list.add("Enzo");
        list2.add("Julio");
        list2.add("Enzo");
        list2.add("Jose");

        // Obtenemos un Iterador y recorremos la lista.
        //Iterator<String> lista = new list.iterator();
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        	}
        System.out.println("Esta el elemento en la lista: " +  list.contains("Marta"));// Ejemplo de Contains
        System.out.println("Esta el elemento en la lista: " +  list.containsAll(list2));
        System.out.println("Son iguales mis listas: " +  list.equals(list2));
        
        
    }
    
    

    public static void cola(){
        Queue<String> cola = new LinkedList<>();
        //Queue<Integer> cola = new LinkedList<>();
        System.out.println("Agregando valores");
        
        
        // Los clientes estan haciendo la fila
        cola.add("Enzo");
        System.out.println(cola);
        cola.add("Pedro");
        System.out.println(cola);
        cola.add("Jose");
        System.out.println(cola);
        cola.add("Juan");
        
        // Reviso si hay personas para atender
        
        String cliente_mirado = cola.peek();
        System.out.println("El cliente que voy a atender es: "+ cliente_mirado);
        System.out.println(cola);
        
        // Atiendoa  una persona
        
        String cliente_atendido = cola.poll();
        System.out.println("El cliente que atendi es: "+ cliente_atendido);
        System.out.println(cola);
        
        // Llega un nuevo cliente
        cola.add("Jorgito");
        System.out.println(cola);
        
        
        /*
        System.out.println(cola.toString());
        System.out.println("\nTamaÃ±o Inicial de la cola: " + cola.size());
        System.out.println("\nRetirando valores");
        while (!cola.isEmpty()) {
            System.out.println("Valor: " + cola.peek());
            cola.poll();
            System.out.println("Tamaño actual de la cola: " + cola.size());            
        }
        System.out.println("Tamañoo final de la cola: " + cola.size());
        */
        
    }

    public static void pila(){
        //Stack<Integer> pila = new Stack<>();
    	
    	Stack<String> pila = new Stack<>();
    	System.out.println("Agregando valores");
    	
    	pila.push("Naomi");
    	pila.push("Milagro");
    	pila.push("Mauro");
    	
    	System.out.println(pila);
    	
    	String elemento = pila.peek();
    	System.out.println("\nSiguiente elemento " + elemento);
    	
    	System.out.println(pila);
    	
    	String sacar = pila.pop();
    	System.out.println(sacar);
    	System.out.println(pila);
    	
    	String sacar2 = pila.pop();
    	System.out.println(sacar2);
    	System.out.println(pila);
    	
    	String sacar3 = pila.pop();
    	System.out.println(sacar3);
    	System.out.println(pila);
    	
    	System.out.println(pila.isEmpty());

    	/*
    	Stack<String> pila = new Stack<>();
        System.out.println("Agregando valores");
        
        //Añadir elementos
        pila.push("Jean");
        pila.push("Buzo");
        pila.push("Campera");
        pila.push("Pantalon");
        pila.push("Medias");
        
        System.out.println(pila);
        
        //Reviso el siguiente elemento
        String elemento = pila.peek();
        System.out.println("Siguiente elmento: " + elemento);
        
        System.out.println(pila);
        
        // Saco un elemento
        
        
        String elemento2 = pila.pop();
        System.out.println("Elemento sacado: " + elemento2);
        
        System.out.println(pila);
        
        String elemento3 = pila.pop();
        System.out.println("Elemento sacado: " + elemento3);
        
        System.out.println(pila);
        
        String elemento4 = pila.pop();
        System.out.println("Elemento sacado: " + elemento4);
        
        // Ingreso uno nuevo
        pila.push("Zapatillas");
        
        System.out.println(pila);
        
        
        
        for (int i = 0; i < 5; i++) {
            pila.push(i);
            System.out.println("Valor: " + i);
        }
        System.out.println(pila);
        System.out.println("\nTamaño Inicial de la pila: " + pila.size());
        System.out.println("\nRetirando valores");
        while (!pila.isEmpty()) {
            System.out.println("Valor: " + pila.pop()); 
            //System.out.println("Tamaño actual de la pila: " + pila.size()); 
            System.out.println(pila);
        }
        System.out.println("TamaÃ±o final de la pila: " + pila.size());
        */
    }
    public static void main(String[] args) throws Exception {
        //lista();
        //cola();
        pila();
    }
       
}