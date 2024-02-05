public class Professor {
    private final String nome;
    private final String disciplina;
    private String escola;

    public Professor(String nome, String disciplina, String escola) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.escola = escola;
    }

    public void darAula() {
        System.out.printf("A professora %s está lecionando a disciplina %s.%n", nome, disciplina);
    }

    public void caminhar() {
        System.out.printf("A professora %s está caminhando até seu local de trabalho, escola %s.%n", nome, escola);
    }

    public static void main(String[] args) {
        Professor professor = new Professor("Maria da Silva", "Física", "Energia");
        professor.caminhar();
        professor.darAula();
    }
}

