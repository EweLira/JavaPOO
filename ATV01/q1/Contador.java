package ATV01.q1;

public class Contador {
    int cont;

    public Contador(){
        this.cont = 0;
    }
    public void incrementar(){
        this.cont++;
    }
    public void zerar(){
        this.cont = 0;
    }
    public int obterValor(){
        return this.cont;
    }
}
