package INF121_1;

import java.awt.Graphics;

import javax.swing.JPanel;

class Circulo {
    public Punto centro;
    public float radio;

    public Circulo(Punto x, float y) {
        this.centro = x;
        this.radio = y;
    }

    public String toString() {
        return "Circulo[Centro=" + centro + ", Radio=" + radio + "]";
    }

    public void DibujaCirculo(Graphics g) {
        int x = (int) (centro.x - radio);
        int y = (int) (centro.y - radio);
        int diameter = (int) (2 * radio);
        g.drawOval(x, y, diameter, diameter);
    }
}

class Dibujo extends JPanel {
    private Linea linea;
    private Circulo circulo;

    public Dibujo(Linea linea, Circulo circulo) {
        this.linea = linea;
        this.circulo = circulo;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        linea.DibujaLinea(g);
        circulo.DibujaCirculo(g);
    }
}

