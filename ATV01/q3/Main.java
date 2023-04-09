package ATV01.q3;

public class Main {
    public static void main(String[] args) {
        Ponto2D ponto1 = new Ponto2D();
        System.out.println("Coordenadas do ponto 1: x = " + ponto1.getX() + ", y = " + ponto1.getY());

        Ponto2D ponto2 = new Ponto2D(3, 4);
        System.out.println("Coordenadas do ponto 2: x = " + ponto2.getX() + ", y = " + ponto2.getY());

        double distancia1 = ponto2.distanciaParaOrigem();
        System.out.println("Distância do ponto 2 para a origem: " + distancia1);

        Ponto2D ponto3 = new Ponto2D(-1, 2);

        double distancia2 = ponto2.distanciaParaPonto(ponto3);
        System.out.println("Distância do ponto 2 para o ponto 3: " + distancia2);
    }
}