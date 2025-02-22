import tkinter as tk
import math

class Punto:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def coord_cartesianas(self):
        return f"({self.x}, {self.y})"

    def coord_polares(self):
        r = math.sqrt(self.x ** 2 + self.y ** 2)
        theta = math.degrees(math.atan2(self.y, self.x))
        return f"(r={r:.2f}, θ={theta:.2f}°)"

    def __str__(self):
        return f"Punto[x={self.x}, y={self.y}]"


class Linea:
    def __init__(self, p1, p2):
        self.p1 = p1
        self.p2 = p2

    def __str__(self):
        return f"Linea[p1={self.p1}, p2={self.p2}]"

    def dibuja_linea(self, canvas):
        canvas.create_line(self.p1.x, self.p1.y, self.p2.x, self.p2.y, fill="black", width=2)


class Circulo:
    def __init__(self, centro, radio):
        self.centro = centro
        self.radio = radio

    def __str__(self):
        return f"Circulo[Centro={self.centro}, Radio={self.radio}]"

    def dibuja_circulo(self, canvas):
        x1 = self.centro.x - self.radio
        y1 = self.centro.y - self.radio
        x2 = self.centro.x + self.radio
        y2 = self.centro.y + self.radio
        canvas.create_oval(x1, y1, x2, y2, outline="blue", width=2)


class DibujoApp:
    def __init__(self, root, linea, circulo):
        self.canvas = tk.Canvas(root, width=400, height=400, bg="white")
        self.canvas.pack()
        linea.dibuja_linea(self.canvas)
        circulo.dibuja_circulo(self.canvas)


def main():
    p1 = Punto(100, 150)
    p2 = Punto(200, 250)
    l1 = Linea(p1, p2)
    c1 = Circulo(p1, 50)

    print("Coordenadas Cartesianas:", p1.coord_cartesianas())
    print("Coordenadas Polares:", p1.coord_polares())
    print("Representación toString:", p1)
    print("Representación toString:", l1)

    root = tk.Tk()
    root.title("Dibujar Línea y Círculo")
    app = DibujoApp(root, l1, c1)
    root.mainloop()


if __name__ == "__main__":
    main()
