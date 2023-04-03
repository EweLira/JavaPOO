package ATV01.q2;

public class Primos {
    private int numero;

    public Primos(int numero){
        this.numero = numero;
    }
    public boolean VerdadeiroPrimo(){
        if(this.numero <= 1){
            return false;
        }
        for (int i = 2;i < Math.sqrt(this.numero); i ++){
            if (this.numero % i == 0){
                return false;
            }
        }
        return true;
    }

}
