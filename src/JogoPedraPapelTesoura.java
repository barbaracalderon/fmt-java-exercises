import java.util.Scanner;

public class JogoPedraPapelTesoura {

    private Jogador melhorJogador;
    private int numeroJogadas;
    private int idadeJogador;
    private String nomeJogador;

    private int pontuacaoJogador = 0;
    private int numeroTentativas = 0;
    Scanner scanner = new Scanner(System.in);



    public void jogar() {

        System.out.println("Vamos jogar...");
        System.out.println("Nome do Jogador: ");

        nomeJogador = scanner.nextLine();
        System.out.println("Idade: ");
        idadeJogador = scanner.nextInt();

        melhorJogador = new Jogador(
                nomeJogador,
                idadeJogador,
                pontuacaoJogador,
                numeroTentativas);

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
            } else {
                melhorJogador.perdePontos();
            }

            melhorJogador.adicionaTentativa();

        }

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
