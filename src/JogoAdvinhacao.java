import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100);
        int tentativas = 0;
        System.out.println("Bem-vindo ao jogo de adivinhação! Tente adivinhar o número entre 0 e 100.");

        while (tentativas < 5) {
            System.out.print("Tentativa " + (tentativas + 1) + ": Digite seu palpite: ");
            int palpite = scanner.nextInt();

            if (palpite == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou o número.");
                break;
            } else if (palpite < numeroAleatorio) {
                System.out.println("O número é maior.");
            } else {
                System.out.println("O número é menor.");
            }

            tentativas++;
        }

        if (tentativas == 5) {
            System.out.println("Suas 5 tentativas acabaram. O número correto era: " + numeroAleatorio);
        }

        scanner.close();
    }
}


