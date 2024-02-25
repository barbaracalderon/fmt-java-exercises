import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Jogadores {


    static ArrayList<Jogador> listaDeJogadores = new ArrayList<>();
    static ArrayList<Jogador> rankingDeJogadores = new ArrayList<>();



    public static ArrayList<Jogador> getListaJogadores() {
        return listaDeJogadores;
    }

    public static ArrayList<Jogador> getRankingDeJogadores() {
        return rankingDeJogadores;
        }

    public void showListaJogadores() {
        if (getListaJogadores().isEmpty()) {
            System.out.println("Lista de jogadores está vazia.");
        } else {
            for (Jogador jogador: getListaJogadores()) {
                System.out.println(
                        getListaJogadores().indexOf(jogador) + ". " + jogador.toString()
                );
            }
        }
    }

    public void showRankingJogadores() {
        if (getListaJogadores().isEmpty()) {
            System.out.println("Lista de jogadores está vazia.");
        } else {
            getListaJogadores().sort(Comparator.comparingInt(Jogador::getPontuacao).reversed());
            if (getListaJogadores().size() > 10) {
                rankingDeJogadores = (ArrayList<Jogador>) getListaJogadores().subList(0, 9);

                for (Jogador jogador: getRankingDeJogadores()) {
                    System.out.println(
                            getRankingDeJogadores().indexOf(jogador) + ". " + jogador.toString()
                    );
                }

            } else {

                for (Jogador jogador: getListaJogadores()) {
                    System.out.println(
                            getListaJogadores().indexOf(jogador) + ". " + jogador.toString()
                    );
            }
        }
    }
    }


}
