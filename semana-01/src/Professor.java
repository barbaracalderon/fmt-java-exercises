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

    public void mostrarInformacoes() {
        System.out.println("- - - - - Informações Professor - - - - -");
        System.out.println("Nome: " + nome);
        System.out.println("Especialidade: " + especialidade);
        System.out.println("Escola: " + escola);
        System.out.println("- - - - - - - - - - - - - - - - - - - - -");
    }

    public static void main(String[] args) {
        Professor professor = new Professor("Maria da Silva", "Física", "Energia");
        professor.mostrarInformacoes();
        professor.caminhar();
        professor.ensinar();
    }
}

