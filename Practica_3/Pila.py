class Pila:
    def __init__(self, n):
        self.arreglo = [0] * n  #Arreglo de tamaño n
        self.top = -1  # Cima de la pila
        self.n = n  # Tamaño de la pila

    def push(self, e):
        if self.isFull():
            print("La pila esta llena!")
            return
        self.top += 1
        self.arreglo[self.top] = e

    def pop(self):
        if self.isEmpty():
            print("La pila esta vacia!")
            return None
        elemento = self.arreglo[self.top]
        self.top -= 1
        return elemento

    def peek(self):
        if self.isEmpty():
            print("La pila esta vacia!")
            return None
        return self.arreglo[self.top]

    def isEmpty(self):
        return self.top == -1

    def isFull(self):
        return self.top == self.n - 1

class Main:
   #Creando una Pila de 3 Elementos
    pila = Pila(3)
    #Adicionamos los 3 elementos
    print("Elementos de la Pila: ")
    pila.push(1)
    pila.push(2)
    pila.push(3)
    print(pila.arreglo[:pila.top + 1])
    #Ultimo elemento de la Pila Añadido
    print("Ultimo elemento:", pila.peek())
    #Extraemos un Elemento
    print("Elemento extraido:", pila.pop())
    #La Pila es Vacia
    print("¿La pila esta vacia?", pila.isEmpty())