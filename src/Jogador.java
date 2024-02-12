import java.util.ArrayList;
import java.util.Scanner;

public class Jogador {
    private String nome;
    private int idade;
    private int pontuacao;
    private int numeroTentativas;

    public Jogador(String nome, int idade, int pontuacao, int numeroTentativas) {
        this.nome = nome;
        this.idade = idade;
        this.pontuacao = pontuacao;
        this.numeroTentativas = numeroTentativas;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            ArrayList<Jogador> listaMelhoresJogadores = MelhoresJogadores.getListaMelhoresJogadores();

            if (checarNomeExiste(nome, listaMelhoresJogadores)) {
                System.out.println("O nome informado já consta na lista de jogadores. Tente outro.");
                nome = scanner.nextLine();
            } else {
                this.nome = nome;
                break;
            }
        }

        scanner.close();
    }

    public boolean checarNomeExiste(String nome, ArrayList<Jogador> listaMelhoresJogadores) {
        for (Jogador jogador: listaMelhoresJogadores) {
            if (jogador.getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }

    public void adicionaPontos() {
        System.out.printf("Jogador ganha 1 ponto.");
        pontuacao++;
    }

    public void perdePontos() {

        System.out.printf("Jogador perdeu x pontos.");
        pontuacao--;
    }

    public void adicionaTentativa() {
        System.out.printf("Jogador adiciona uma tentativa.");
        numeroTentativas++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getNumeroTentativas() {
        return numeroTentativas;
    }

    public void setNumeroTentativas(int numeroTentativas) {
        this.numeroTentativas = numeroTentativas;
    }

}
