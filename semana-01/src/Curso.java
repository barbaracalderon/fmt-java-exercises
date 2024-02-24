import java.util.ArrayList;

public class Curso {

    static String nome;
    static String descricao;
    static ArrayList<String> listaDeProfessores;
    static int cargaHoraria;

    public Curso(String nome) {
        Curso.nome = nome;
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

    public static void setDescricao(String descricao) {
        Curso.descricao = descricao;
    }

    public static void setCargaHoraria(int cargaHoraria) {
        Curso.cargaHoraria = cargaHoraria;
    }

}
