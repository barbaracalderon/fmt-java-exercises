public class Jogador {
    private final String nome;
    private final int idade;
    private int pontuacao;
    private int numeroTentativas;

    public Jogador(String nome, int idade, int pontuacao, int numeroTentativas) {
        this.nome = nome;
        this.idade = idade;
        this.pontuacao = pontuacao;
        this.numeroTentativas = numeroTentativas;
    }

    public void adicionaPontos() {
        System.out.printf("Jogador ganha x pontos.");
    }

    public void perdePontos() {
        System.out.printf("Jogador perdeu x pontos.");
    }

    public void adicionaTentativa() {
        System.out.printf("Jogador adiciona uma tentativa.");
    }
}
