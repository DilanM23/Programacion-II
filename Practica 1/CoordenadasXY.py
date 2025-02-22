import math

class Punto:
    def __init__(self, x: float, y: float):
        self.x = x
        self.y = y

    def coord_cartesianas(self):
        return f"({self.x}, {self.y})"

    def coord_polares(self):
        r = math.sqrt(self.x ** 2 + self.y ** 2)
        theta = math.degrees(math.atan2(self.y, self.x))  # Ángulo en grados
        return f"(r={r}, θ={theta}°)"

    def __str__(self):
        return f"Punto[x={self.x}, y={self.y}]"

# Principal
if __name__ == "__main__":
    p = Punto(3, 4)
    print("Coordenadas Cartesianas:", p.coord_cartesianas())
    print("Coordenadas Polares:", p.coord_polares())
    print("Representación toString:", str(p))
