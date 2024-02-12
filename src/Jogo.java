import java.util.Scanner;

public class Jogo {

    private Jogador melhorJogador;
    private int numeroJogadas;

    public void jogar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Iniciando o jogo # [Pedra-Papel-Tesoura] #");

        while (true) {
            System.out.println("Qual sua jogada? (Pe=Pedra) (P=Papel) (T=Tesoura) (S=Sair): ");
            String jogadaJogador = scanner.nextLine().toLowerCase();

            if (jogadaJogador.equals("s")) {
                break;
            }

            if (!jogadaJogador.equals("pe") && !jogadaJogador.equals("p") && !jogadaJogador.equals("t")) {
                System.out.println("Valor inválido. Tente novamente: ");
                continue;
            }

            numeroJogadas++;
            String jogadaComputador = gerarJogadaComputador();

            if (jogadaComputador == null) {
                System.out.println("Erro.");
                break;
            }


            System.out.println("Escolha do computador: " + jogadaComputador);
            System.out.println("Escolha do jogador: " + jogadaJogador);

            String resultado = verificarVencedor(jogadaComputador, jogadaJogador);

            System.out.println("Vencedor: " + resultado);

            if (resultado.equals("Jogador ganhou!")) {
                melhorJogador.adicionaPontos();
            }

            melhorJogador.adicionaTentativa();

        }

        scanner.close();

    }

    private String gerarJogadaComputador() {
        int numeroQualquer = (int) (Math.random() * 3);

        switch (numeroQualquer) {
            case 0:
                return "pe";
            case 1:
                return "p";
            case 3:
                return "t";
        }
        return null;
    }


    private String verificarVencedor(String jogadaComputador, String jogadaJogador) {
        if (jogadaComputador.equals(jogadaJogador)) {
            return "Deu empate! :(";
        } else if ((jogadaComputador.equals("pedra") && jogadaJogador.equals("tesoura")) ||
                (jogadaComputador.equals("papel") && jogadaJogador.equals("pedra")) ||
                (jogadaComputador.equals("tesoura") && jogadaJogador.equals("papel"))) {
            return "Computador ganhou! Você perdeu!";
        } else {
            return "Jogador ganhou! Computador perdeu!";
        }
    }

    public Jogador getMelhorJogador() {
        return melhorJogador;
    }

    public int getNumeroJogadas() {
        return numeroJogadas;
    }

}
