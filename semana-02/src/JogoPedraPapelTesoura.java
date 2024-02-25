import java.util.InputMismatchException;

public class JogoPedraPapelTesoura {

    public static void iniciarJogo() {

        while (true) {
            printJogoPedraPapelTestouraMenuOptions();
            System.out.print("Digite sua opção: ");

            try {
                int userOption = Sistema.scanner.nextInt();

                switch (userOption) {
                    case 0:
                        printJogoPedraPapelTestouraEndMessage();
                        break;
                    case 1:
                        jogar();
                        break;
                    case 2:
                        System.out.println();
                        Jogadores.showListaJogadores();
                        break;
                    case 3:
                        Jogadores.showRankingJogadores();
                        break;
                }

                if (userOption == 0) {
                    break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Opção inválida para Jogo Pedra-Papel-Testoura. Tente novamente.");
                break;
            }


        }

    }

    public static void printJogoPedraPapelTestouraMenuOptions() {
        System.out.println(
                "- - - - - [ Jogo Pedra-Papel-Testoura ] - - - - -\n" +
                        "1. Jogar \n" +
                        "2. Ver lista de jogadores \n" +
                        "3. Ver ranking top 10 \n" +
                        "0. Sair \n" +
                "- - - - - - - - - - - - - - - - - - - - - - - - -"
        );
    }

    public static void printJogoPedraPapelTestouraEndMessage() {
        System.out.println("... Saindo do Jogo Pedra-Papel-Tesoura.");
    }

    public static void jogar() {

        Jogador playerAtual = createPlayer();
        Jogadores.adicionarJogadorNaListaJogadores(playerAtual);



        while (true) {
            showJogoPedraPapelTesouraMenu();

            String jogadaJogador = Sistema.scanner.next().toLowerCase();

            if (jogadaJogador.equals("s")) {
                break;
            } else if (!jogadaJogador.equals("pe") && !jogadaJogador.equals("p") && !jogadaJogador.equals("t")){
                System.out.println("Valor inválido. Tente novamente: ");
            } else {

                String jogadaComputador = gerarJogadaComputador();

                if (jogadaComputador == null) {
                    System.out.println("Erro na jogada do computador.");
                    break;
                }

                System.out.println("Escolha do computador: " + jogadaComputador);
                System.out.println("Escolha do jogador: " + jogadaJogador);

                String resultado = verificarVencedor(jogadaComputador, jogadaJogador);

                System.out.println("Vencedor da partida ---> " + resultado.toUpperCase() + " ganhou!");

                if (resultado.equals("jogador")) {
                    playerAtual.adicionaPontos();
                } else if (resultado.equals("computador")) {
                    playerAtual.perdePontos();
                }

                playerAtual.adicionaTentativa();

            }

        }

    }

    public static Jogador createPlayer() {

        String nomeJogador = null;
        boolean nomeJogadorJaExiste = true;

        while (nomeJogadorJaExiste) {
            System.out.print("Nome do jogador: ");
            nomeJogador = Sistema.scanner.next();
            nomeJogadorJaExiste = Jogadores.verificarJogadorExiste(nomeJogador);
            if (nomeJogadorJaExiste) {
                System.out.println("Este nome já existe. Tente outro.");;
            }
        }

        int idadeJogador = 0;
        boolean idadeInvalida = true;
        while (idadeInvalida) {

            System.out.print("Idade do jogador: ");
            idadeJogador = Sistema.scanner.nextInt();
            idadeInvalida = Jogador.verificarIdadeValida(idadeJogador);

        }

        System.out.println("Jogador criado com sucesso.");

        int pontuacao = 0;
        int numeroTentativas = 0;

        return new Jogador(nomeJogador, idadeJogador, pontuacao, numeroTentativas);
    }

    public static String gerarJogadaComputador() {
        int numeroQualquer = (int) (Math.random() * 3);

        return switch (numeroQualquer) {
            case 0 -> "pe";
            case 1 -> "p";
            case 3 -> "t";
            default -> null;
        };

    }

    public static String verificarVencedor(String jogadaComputador, String jogadaJogador) {
        if (jogadaComputador.equals(jogadaJogador)) {
            return "empate";
        } else if ((jogadaComputador.equals("pe") && jogadaJogador.equals("t")) ||
                (jogadaComputador.equals("p") && jogadaJogador.equals("pe")) ||
                (jogadaComputador.equals("t") && jogadaJogador.equals("p"))) {
            return "computador";
        } else {
            return "jogador";
        }
    }

    public static void showJogoPedraPapelTesouraMenu() {
        System.out.print(
                """
                        - - - - - - - - - - -\s
                        Vamos jogar! As opções são:\s
                        Pe=Pedra\s
                        P=Papel
                        T=Tesoura
                        S=Sair
                        - - - - - - - - - - -\s
                        Digite sua escolha:\s"""
        );
    }




}
