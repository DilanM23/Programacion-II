package INF121_1;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        Punto p1 = new Punto(100, 150);
        Punto p2 = new Punto(200, 250);
        Linea l1 = new Linea(p1, p2);
        Circulo c1 = new Circulo(p1, 50);

        System.out.println("Coordenadas Cartesianas: " + p1.coord_cartesianas());
        System.out.println("Coordenadas Polares: " + p1.coord_polares());
        System.out.println("Representación toString: " + p1.toString());
        System.out.println("Representación toString: " + l1.toString());

        JFrame frame = new JFrame();
        Dibujo dibujo = new Dibujo(l1, c1);
        frame.add(dibujo);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
