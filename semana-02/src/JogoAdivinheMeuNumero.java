import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class JogoAdivinheMeuNumero {

    static Scanner scanner = new Scanner(System.in);
    static private int guessRange = 10;
    static Random random = new Random();
    static private int numberChosen;

    public static void iniciarJogo() {

        while (true) {
            printJogoAdivinheMeuNumeroMenuOptions();
            System.out.print("Digite sua opção: ");

            try  {
                int userOption = scanner.nextInt();

                switch (userOption) {
                    case 0:
                        printJogoAdivinheMeuNumeroEndMessage();
                        break;
                    case 1:
                        System.out.print("Digite valor para o range de adivinhação: ");
                        guessRange = scanner.nextInt();
                        break;
                    case 2:
                        jogar();
                        break;
                }

                if (userOption == 0) {
                    break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Opção inválida para Jogo Pedra-Papel-Tesoura. Tente novamente.");
                break;
            }

        }
    }

    public static void printJogoAdivinheMeuNumeroMenuOptions() {
        System.out.println(
                "- - - - - [ Jogo Adivinhe Meu Número ] - - - - -\n" +
                        "1. Definir range de adivinhação\n" +
                        "2. Jogar\n" +
                        "0. Sair\n" +
                "- - - - - - - - - - - - - - - - - - - - - - - - -\n" +
                        "PS: Se optar por não definir o range, usaremos default de 10"
        );
    }

    public static void printJogoAdivinheMeuNumeroEndMessage() {
        System.out.println("... Saindo Jogo Adivinhe Meu Número.");
    }

    public static void jogar() {
        System.out.print("Vamos jogar! Adivinhe um número de 0 a " + guessRange + ".\n" +
                "Digite sua opção: ");

        setNumberChosen();

        while (true) {
            int guessNumber = scanner.nextInt();
            if (guessNumber == -1) {
                System.out.println("Parando o jogo.");
                break;
            } else if (guessNumber == getNumberChosen()) {
                System.out.println("Você acertou!");
                break;
            } else {
                System.out.print("Você perdeu! Tente novamente ou digite -1 para parar: ");
            }
        }

    }

    public static void setNumberChosen() {
        numberChosen = random.nextInt(guessRange);
    }

    public static int getNumberChosen() {
        return numberChosen;
    }

}
