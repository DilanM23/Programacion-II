class Cola:
    def __init__(self, n):
        self.n = n
        self.arreglo = [0] * n
        self.inicio = 0
        self.fin = -1
    #Insertar elementos a la Cola
    def insert(self, e):
        if self.is_full():
            print("La cola esta llena!")
            return
        if self.is_empty():
            self.inicio = 0
            self.fin = 0
        else:
            self.fin = (self.fin + 1) % self.n
        self.arreglo[self.fin] = e
    #Eliminar elementos de la Cola
    def remove(self):
        if self.is_empty():
            print("La cola esta vacia!")
            return -1
        temp = self.arreglo[self.inicio]
        if self.inicio == self.fin:
            self.inicio = 0
            self.fin = -1
        else:
            self.inicio = (self.inicio + 1) % self.n
        return temp
    #
    def peek(self):
        if self.is_empty():
            print("La cola esta vacia!")
            return -1
        return self.arreglo[self.inicio]
    #Es Vacia
    def is_empty(self):
        return self.fin == -1
    #Es Llena
    def is_full(self):
        return (self.fin + 1) % self.n == self.inicio and self.fin != -1
    #Tamaño de la Cola
    def size(self):
        if self.is_empty():
            return 0
        if self.fin >= self.inicio:
            return self.fin - self.inicio + 1
        return self.n - self.inicio + self.fin + 1

#MAIN
class Main:
    print("\n<--COLAS-->")
    cola = Cola(5)
    
    # Insertar elementos
    cola.insert(1)
    cola.insert(2)
    cola.insert(3)
    cola.insert(4)
    cola.insert(5)
    
    # Mostrar el elemento en la parte frontal
    print("Elemento en el frente:", cola.peek())
    
    # Extraer elementos de la cola
    print("Elemento extraido:", cola.remove())
    print("Elemento extraido:", cola.remove())
    print("Elemento extraido:", cola.remove())
    print("Elemento extraido:", cola.remove())
    print("Elemento extraido:", cola.remove())
    
    # Verificar si la cola esta vacia
    print("¿La cola esta vacia?:", cola.is_empty())