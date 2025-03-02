package Pila_Cola;

public class Main {

	public static void main(String[] args) {
		//PILA
		System.out.println("<--PILAS-->");
		// Crear una pila con 5 elementos
		Pila pila = new Pila(5);
		// Insertar elementos en la pila
		pila.push(1);
		pila.push(2);
		pila.push(3);
		pila.push(4);
		pila.push(5);
		// Ultimo elemento
		System.out.println("Ultimo Elemento: " + pila.peek());
        // Extraer elementos
        System.out.println("Elemento extraido: " + pila.pop());
        System.out.println("Elemento extraido: " + pila.pop());
        System.out.println("Elemento extraido: " + pila.pop());
        System.out.println("Elemento extraido: " + pila.pop());
        System.out.println("Elemento extraido: " + pila.pop());
        // Verificar si la pila está vacía
        System.out.println("¿La pila esta vacia?: " + pila.isEmpty());
        
        //COLAS
        // Crear una cola
        System.out.println("\n<--COLAS-->");
        Cola cola = new Cola(5);
        // Insertar elementos
        cola.insert(1);
        cola.insert(2);
        cola.insert(3);
        cola.insert(4);
        cola.insert(5);

        // Mostrar el elemento en la parte frontal
        System.out.println("Elemento en el frente: " + cola.peek());

        // Extraer elementos de la cola
        System.out.println("Elemento extraido: " + cola.remove());
        System.out.println("Elemento extraido: " + cola.remove());
        System.out.println("Elemento extraido: " + cola.remove());
        System.out.println("Elemento extraido: " + cola.remove());
        System.out.println("Elemento extraido: " + cola.remove());

        // Verificar si la cola esta vacia
        System.out.println("¿La cola está vacia?: " + cola.isEmpty());
    }	
}
