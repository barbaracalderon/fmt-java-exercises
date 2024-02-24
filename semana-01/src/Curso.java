import java.util.ArrayList;
import java.util.Scanner;

public class Curso {

    static String nome;
    static String descricao;
    static ArrayList<String> listaDeProfessores;
    static int cargaHoraria;

    public Curso(String nome, String descricao, ArrayList<String> listaDeProfessores, int cargaHoraria) {
        Curso.nome = nome;
        Curso.descricao = descricao;
        Curso.listaDeProfessores = listaDeProfessores;
        Curso.cargaHoraria = cargaHoraria;
    }

    public void progresso() {
        System.out.println("Este curso está em progresso.");
    }

    public void notas() {
        System.out.println("Este curso tem as notas do aluno.");
    }

    public void participacao() {
        System.out.println("Este curso tem alunos participando.");
    }

    public void mostrarInformacoes() {
        System.out.println("- - - - - Informações Curso - - - - -");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Professores: " + listaDeProfessores);
        System.out.println("- - - - - - - - - - - - - - - - - - -");
    }

    public static void main(String[] args) {
        ArrayList<String> listaDeProfessores = new ArrayList<>();
        listaDeProfessores.add("Maria da Silva");
        listaDeProfessores.add("João da Silva");
        Curso curso = new Curso("Física",
                "Disciplina de física mecânica e relativista.",
                listaDeProfessores,
                20);
        curso.mostrarInformacoes();
        curso.progresso();
        curso.notas();
        curso.participacao();
    }


}
