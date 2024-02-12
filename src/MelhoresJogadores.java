import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class MelhoresJogadores {

    static ArrayList<Jogador> listaMelhoresJogadores = new ArrayList<>();

    public void mostrarListaMelhoresJogadores() {
        if (listaMelhoresJogadores.isEmpty()) {
            System.out.println("Lista de melhores jogadores está vazia.");
        } else {
            Collections.sort(listaMelhoresJogadores, Comparator.comparingInt(Jogador::getPontuacao).reversed());
            if (listaMelhoresJogadores.size() > 10) {
                listaMelhoresJogadores = (ArrayList<Jogador>) listaMelhoresJogadores.subList(0, 10);
            }
            for (int i = 0; i < listaMelhoresJogadores.size(); i++) {
                Jogador jogador = listaMelhoresJogadores.get(i);
                System.out.println( jogador.getNome() + " (" + jogador.getPontuacao() + " pontos) " + (i + 1));
            }
        }
    }

    public static ArrayList<Jogador> getListaMelhoresJogadores() {
        return listaMelhoresJogadores;
    }

}
