package Pila_Cola;

public class Pila {
	private long[] arreglo;
	private int top;
	private int n;

	    // Constructor
	    public Pila(int n) {
	        this.n = n;
	        this.arreglo = new long[n];
	        this.top = -1;
	    }

	    // Agregar un Elemento
	    public void push(long e) {
	        if (isFull()) {
	            System.out.println("La pila está llena!");
	            return;
	        }
	        arreglo[++top] = e;
	    }

	    // Extraer un Elemento
	    public long pop() {
	        if (isEmpty()) {
	            System.out.println("La pila está vacía!");
	            return -1;
	        }
	        return arreglo[top--];
	    }

	    // Elemento en la Cima
	    public long peek() {
	        if (isEmpty()) {
	            System.out.println("La pila está vacía!");
	            return -1;
	        }
	        return arreglo[top];
	    }

	    // Verifica si la Pila esta vacia
	    public boolean isEmpty() {
	        return top == -1;
	    }

	    // Verifica si la Pila esta llena
	    public boolean isFull() {
	        return top == n - 1;
	    }
}
