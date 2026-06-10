import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {


        runLinkList();

        runQueue();

        runStack();

        Ejercicio1 ejercicio1 = new Ejercicio1();
        System.out.println(ejercicio1.invertString("COMPUTACION"));
    
    
        Ejercicio2 ejercicio2 = new Ejercicio2();
        System.out.println(ejercicio2.esPalindromo("capacidad"));
        System.out.println(ejercicio2.esPalindromo("COMPUTACION"));
        System.out.println(ejercicio2.esPalindromo("RADAR"));

    }
    private static void runStack() {
    ArrayDeque<String> pila = new ArrayDeque<>();

        pila.push("Jose");
        pila.push("Adnres");
        pila.push("Ana");
        pila.push("Maria");
        pila.push("Maria2");

        System.out.println(pila.isEmpty());
        System.out.println(pila.size());

        System.out.println(pila.peek());
        System.out.println(pila.size());

        System.out.println(pila.pop());
        System.out.println(pila.size());

        while (!pila.isEmpty()) {
            String cliente = pila.pop();
            System.out.println("Sale -> " + cliente);
        }

    System.out.println(pila.size());
}
    private static void runQueue() {
        Queue<String> cola =new ArrayDeque<>();
            cola.offer("Jose");
            cola.offer("Andres");
            cola.offer("Ana");

            System.out.println(cola.isEmpty());
            System.out.println(cola.peek()); // -> "Jose"
            System.out.println(cola.size()); // -> 3
            System.out.println(cola.poll()); // -> "Jose" saca
            System.out.println(cola.size()); // -> 2 [Andres, Ana]

        // [] isEmpty -> true
        while (!cola.isEmpty()) { // !true = false
            String cliente = cola.poll(); // -> "Ana" saca | cliente="Ana"
            System.out.println("Atendi a "+ cliente); // -> "Atendi a Ana"
        }
    }

    private static void runLinkList() {
        LinkedList<String> nombres =new LinkedList<>();
        ArrayList<String> nombres2 =new ArrayList<>();

            nombres.add("Juan");
            nombres.add("pedro");
            nombres.add("Maria");
            nombres.add("Diago");
            nombres.add("Mateo ");
            // size =5

            String primero = nombres.getFirst();
            System.out.println(primero);
            System.out.println(nombres.getFirst());

            System.out.println(nombres.get(4)); // O(n) o O(1)

            System.out.println(nombres.getLast());
            System.out.println(nombres.get(nombres.size() - 1));

            System.out.println(nombres.pop());
            System.out.println(nombres.size()); // 4

    }

}

