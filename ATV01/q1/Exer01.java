package ATV01.q1;

public class Exer01 {
    public static void main(String[] args) {
        Contador contador = new Contador();

        System.out.println("Valor: " + contador.obterValor());

        contador.incrementar();
        System.out.println("Após incrementar:  " + contador.obterValor());

        contador.zerar();
        System.out.println("Zerado: " + contador.obterValor());

        contador.incrementar();
        contador.incrementar();
        contador.incrementar();
        System.out.println("Valor do contador após 3: " + contador.obterValor());
    }
}
