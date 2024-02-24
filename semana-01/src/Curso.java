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

    public static void progresso() {
        System.out.println("Este curso está em progresso.");
    }

    public static void notas() {
        System.out.println("Este curso tem as notas do aluno.");
    }

    public static void participacao() {
        System.out.println("Este curso tem alunos participando.");
    }

    public static void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Professores: " + listaDeProfessores);


    }

    public static void main(String[] args) {
        ArrayList<String> listaDeProfessores = new ArrayList<>();
        listaDeProfessores.add("Maria da Silva");
        listaDeProfessores.add("João da Silva");
        new Curso("Física",
                "Disciplina de física mecânica e relativista.",
                listaDeProfessores,
                20);
        mostrarInformacoes();
        progresso();
        notas();
        participacao();
    }


}
