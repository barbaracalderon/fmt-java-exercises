import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ProfessorCourseSelection {
    public static void main(String[] args) {
        ArrayList<String> courseList = new ArrayList<>();
        ArrayList<String> professorList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int userOption;

        while (true) {
            System.out.println("====== [Professores & Cursos] ======");
            System.out.println("1 - Adicionar professor");
            System.out.println("2 - Visualizar lista de professores");
            System.out.println("3 - Remover professor");
            System.out.println("4 - Adicionar curso");
            System.out.println("5 - Visualizar lista de cursos");
            System.out.println("6 - Remover curso");
            System.out.println("0 - Sair");
            System.out.println("===================================");
            System.out.print("Digite sua opção: ");



            try {
                userOption = scanner.nextInt();

                switch (userOption) {
                    case 1:
                        addProfessor(professorList);
                        break;
                    case 2:
                        showProfessors(professorList);
                        break;
                    case 3:
                        removeProfessor(professorList);
                        break;
                    case 4:
                        addCourse(courseList);
                        break;
                    case 5:
                        showCourses(courseList);
                        break;
                    case 6:
                        removeCourse(courseList);
                        break;
                    case 0:
                        printMessageAndLeave();
                        break;
                }
                if (userOption == 0) {
                    break;
                }
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Opção inválida. Tente novamente.\n");
            }
        }
    }

    private static void addProfessor(ArrayList<String> professorList){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do professor: ");
        String professorNome = scanner.nextLine();
        professorList.add(professorNome);

        System.out.println("Professor adicionado na lista com sucesso.\n\n");
    }

    private static void addCourse(ArrayList<String> courseList){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do curso: ");
        String cursoNome = scanner.nextLine();
        courseList.add(cursoNome);

        System.out.println("Curso adicionado na lista com sucesso.\n\n");
    }

    private static void showProfessors(ArrayList<String> professorList){
        if (professorList.isEmpty()) {
            System.out.println("Lista vazia! Nenhum professor adicionado.\n");
        } else {
            System.out.println("Lista de professores abaixo:");

            int i = 0;
            for (String s: professorList) {
                System.out.println(i + ". " + s);
                i++;
            }
            System.out.println();
        }
    }

    private static void removeProfessor(ArrayList<String> professorList) {
        if (professorList.isEmpty()) {
            System.out.println("Lista vazia! Nenhum professor adicionado.\n");
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o número do professor a remover: ");
            int professorIndice = scanner.nextInt();
            professorList.remove(professorIndice);
            System.out.println("Professor removido da lista com sucesso.\n\n");
        }
    }

    private static void showCourses(ArrayList<String> courseList) {
        if (courseList.isEmpty()) {
            System.out.println("Lista vazia! Nenhuma disciplina adicionada.\n");
        } else {
            System.out.println("Lista de disciplinas abaixo:");

            int i = 0;
            for (String s : courseList) {
                System.out.println(i + ". " + s);
                i++;
            }
            System.out.println();
        }
    }

    private static void removeCourse(ArrayList<String> courseList) {
            if (courseList.isEmpty()) {
                System.out.println("Lista vazia! Nenhuma disciplina adicionada.\n");
            } else {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Digite o número do curso a remover: ");
                int cursoIndice = scanner.nextInt();
                courseList.remove(cursoIndice);
                System.out.println("Curso removido da lista com sucesso.\n\n");
            }
        }

    private static void printMessageAndLeave(){
        System.out.println("Desconectando o sistema...");
        System.out.println("...Até a próxima.");
    }
}