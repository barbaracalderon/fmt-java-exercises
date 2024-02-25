import java.util.InputMismatchException;
import java.util.Scanner;

public class Sistema {

    static Scanner scanner = new Scanner(System.in);


    public static void inicializarJogos() {

        while (true) {
            printJogosOptions();
            System.out.print("Vamos jogar! Digite sua opção: ");

            try {
                int userOption = scanner.nextInt();
                switch (userOption) {
                    case 0:
                        printEndMessage();
                        break;
                    case 1:
                        System.out.println("Você escolheu Pedra-Papel-Tesoura.");
                        JogoPedraPapelTesoura.iniciarJogo();
                        break;
                    case 2:
                        System.out.println("Você escolheu Adivinhe-Meu-Número.");
                        JogoAdivinheMeuNumero.iniciarJogo();
                        break;
                }

                if (userOption == 0) {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Opção inválida. Tente novamente.");
            }

        }


    }

    public static void printJogosOptions() {
        System.out.println(
                "- - - - - [Sistema de Jogos] - - - - -\n" +
                        "1. Pedra Papel Tesoura\n" +
                        "2. Adivinhe Meu Número\n" +
                        "0. Sair\n" +
                "- - - - - - - - - - - - - - - - - - -"
        );
    }

    public static void printEndMessage() {
        System.out.println("Você escoheu sair. Encerrando o sistema.");
    }


}
