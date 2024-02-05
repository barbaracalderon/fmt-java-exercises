public class Professor {
    private final String nome;
    private final String especialidade;
    private String escola;

    public Professor(String nome, String especialidade, String escola) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.escola = escola;
    }

    public void ensinar() {
        System.out.printf("A professora %s está lecionando a disciplina %s.%n", nome, especialidade);
    }

    public void caminhar() {
        System.out.printf("A professora %s está caminhando até seu local de trabalho, escola %s.%n", nome, escola);
    }

    public static void main(String[] args) {
        Professor professor = new Professor("Maria da Silva", "Física", "Energia");
        professor.caminhar();
        professor.ensinar();
    }
}

