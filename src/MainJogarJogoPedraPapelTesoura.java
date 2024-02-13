import java.util.InputMismatchException;
import java.util.Scanner;

public class MainJogarJogoPedraPapelTesoura {
    public static MelhoresJogadores melhoresJogadores = new MelhoresJogadores();
    public static JogoPedraPapelTesoura jogoPedraPapelTesoura = new JogoPedraPapelTesoura();

    public static void main(String[] args) {
        int userOption;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("====== [Jogo do Pedra-Papel-Tesoura] ======");
            System.out.println("1 - Ver Ranking Top 10");
            System.out.println("2 - Jogar");
            System.out.println("0 - Sair do jogo");
            System.out.println("===================================");
            System.out.print("Digite sua opção: ");

            try {
                userOption = scanner.nextInt();

                switch (userOption) {
                    case 1:
                        melhoresJogadores.mostrarListaMelhoresJogadores();
                        break;
                    case 2:
                        jogoPedraPapelTesoura.jogar();
                        break;
                    case 0:
                        break;
                }

                if (userOption == 0) {
                    break;
                }

            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Opção inválida. Tente novamente.\n");
            }
        }

    }

}
