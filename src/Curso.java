import java.util.ArrayList;

public class Curso {

    private final String nome;
    private String descricao;
    private ArrayList<String> professoresList;
    private int cargaHoraria;

    public Curso(String nome, String descricao, ArrayList<String> professoresList, int cargaHoraria) {
        this.nome = nome;
        this.descricao = descricao;
        this.professoresList = professoresList;
        this.cargaHoraria = cargaHoraria;
    }

    public void progresso() {
        System.out.println("O curso está em progresso.");
    }

    public void notas() {
        System.out.println("As notas deste curso ainda não foram lançadas.");
    }

    public void participacao() {
        System.out.println("Alguns professores fazem fazem parte deste curso, ensinando.");
    }

    public static void main(String[] args) {
        ArrayList<String> professoresList = new ArrayList<>();
        Curso curso = new Curso("Física", "Disciplina de física mecânica e relativista.", professoresList, 20);
        curso.progresso();
        curso.notas();
        curso.participacao();
    }

}
