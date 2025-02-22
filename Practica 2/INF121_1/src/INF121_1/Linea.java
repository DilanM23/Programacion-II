package INF121_1;

import java.awt.Graphics;

class Linea {
    public Punto p1;
    public Punto p2;

    public Linea(Punto x, Punto y) {
        this.p1 = x;
        this.p2 = y;
    }

    public String toString() {
        return "Linea[p1=" + p1 + ", p2=" + p2 + "]";
    }

    public void DibujaLinea(Graphics g) {
        g.drawLine((int) p1.x, (int) p1.y, (int) p2.x, (int) p2.y);
    }
}

