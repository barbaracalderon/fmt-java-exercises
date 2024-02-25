import java.util.ArrayList;
import java.util.Scanner;

public class Jogador {

    private String nome;
    private int idade;
    private int pontuacao;
    private int numeroTentativas;

    Scanner scanner = new Scanner(System.in);


    public Jogador(String nome, int idade, int pontuacao, int numeroTentativas) {
        this.nome = nome;
        this.idade = idade;
        this.pontuacao = pontuacao;
        this.numeroTentativas = numeroTentativas;

        while (true) {
            ArrayList<Jogador> listaJogadores = Jogadores.getListaJogadores();
            if (nomeJogadorExiste(nome, listaJogadores)) {
                System.out.print("O nome informado já consta na lista de jogadores. Tente outro: ");
                nome = scanner.next();
            } else {
                this.nome = nome;
                break;
            }
        }
    }

    public void adicionaPontos() {
        System.out.println("Jogador ganha 1 ponto.");
        pontuacao++;
        setPontuacao(pontuacao);
    }

    public void perdePontos() {
        System.out.println("Jogador perdeu 1 ponto.");
        pontuacao--;
        setPontuacao(pontuacao);
    }

    public void adicionaTentativa() {
        System.out.println("Jogador adiciona uma tentativa.");
        numeroTentativas++;
        setNumeroTentativas(numeroTentativas);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getPontuacao() {
        return this.pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getNumeroTentativas() {
        return this.numeroTentativas;
    }

    public void setNumeroTentativas(int numeroTentativas) {
        this.numeroTentativas = numeroTentativas;
    }

    public boolean nomeJogadorExiste(String nome, ArrayList<Jogador> listaJogadores) {
        for (Jogador jogador: listaJogadores) {
            if (jogador.getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }

    public static boolean verificarIdadeValida(int idadeJogador) {
        return idadeJogador <= 0 || idadeJogador >= 120;
    }

    @Override
    public String toString() {
        return "Jogador {" +
                " nome=" + getNome() +
                " idade=" + getIdade() +
                " pontuacao=" + getPontuacao() +
                " numeroTentativas=" + getNumeroTentativas() +
                "}";
    }

}
