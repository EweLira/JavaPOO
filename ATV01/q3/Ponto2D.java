package ATV01.q3;

public class Ponto2D{
    private double x;
    private double y;

    public Ponto2D(){
        this.x = 0;
        this.y = 0;
    }
    public Ponto2D(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distanciaParaOrigem() {
        return Math.sqrt(x*x + y*y);
    }

    public double distanciaParaPonto(Ponto2D ponto) {
        double dx = x - ponto.getX();
        double dy = y - ponto.getY();
        return Math.sqrt(dx*dx + dy*dy);
    }
}