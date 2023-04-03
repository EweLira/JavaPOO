package ATV01.q2;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        Primos primo = new Primos(numero);

        if(primo.VerdadeiroPrimo()) {
            System.out.println("O número " + numero + " é primo");
        }else {
            System.out.println("O número " + numero + " não é primo");
        }

    }
}