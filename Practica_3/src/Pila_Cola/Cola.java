package Pila_Cola;

public class Cola {
    private long[] arreglo;
    private int inicio;
    private int fin;
    private int n;

    // Constructor
    public Cola(int n) {
        this.n = n;
        this.arreglo = new long[n];
        this.inicio = 0;
        this.fin = -1;
    }

    // Insertar un elemento en la cola
    public void insert(long e) {
        if (isFull()) {
            System.out.println("La cola esta llena!");
            return;
        }
        if (isEmpty()) {
            inicio = 0;
            fin = 0;
        } else {
            fin = (fin + 1) % n;
        }
        arreglo[fin] = e;
    }

    // Eliminar un elemento de la cola
    public long remove() {
        if (isEmpty()) {
            System.out.println("La cola esta vacia!");
            return -1;
        }
        long temp = arreglo[inicio];
        if (inicio == fin) {
            inicio = 0;
            fin = -1;
        } else {
            inicio = (inicio + 1) % n;
        }
        return temp;
    }

    // Obtener elemento en la parte frontal
    public long peek() {
        if (isEmpty()) {
            System.out.println("La cola esta vacia!");
            return -1;
        }
        return arreglo[inicio];
    }

    // Verificar si la cola esta vacia
    public boolean isEmpty() {
        return fin == -1;
    }

    // Verificar si la cola esta llena
    public boolean isFull() {
        return (fin + 1) % n == inicio && fin != -1;
    }

    // Obtener el tamaño actual de la cola
    public int size() {
        if (isEmpty()) {
            return 0;
        }
        if (fin >= inicio) {
            return fin - inicio + 1;
        }
        return n - inicio + fin + 1;
    }
}
