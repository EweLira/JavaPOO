package ATV03;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do bichinho: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a classe do bichinho: ");
        String classe = scanner.nextLine();
        System.out.print("Digite a família do bichinho: ");
        String familia = scanner.nextLine();

        Animais bichinho = new Animais(nome, classe, familia);

        while (bichinho.estado) {
            System.out.println("Escolha uma ação para o seu bichinho:");
            System.out.println("1 - Comer");
            System.out.println("2 - Correr");
            System.out.println("3 - Dormir");
            System.out.println("4 - Sair");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    bichinho.comer();
                    break;
                case 2:
                    bichinho.correr();
                    break;
                case 3:
                    bichinho.dormir();
                    break;
                case 4:
                    bichinho.morrer();
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}
