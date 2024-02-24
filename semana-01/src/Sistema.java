import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Sistema {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> coursesList = new ArrayList<>();
    static ArrayList<String> professorsList = new ArrayList<>();
    static ArrayList<String> finishedCoursesList = new ArrayList<>();
    static String userString;




    public static void inicializarMenu() {

        while (true) {
            printMenuOptions();
            System.out.print("Digite sua opção: ");

            try {
                int userOption = scanner.nextInt();
                switch (userOption) {
                    case 0:
                        printEndMessage();
                        break;
                    case 1:
                        System.out.print("Digite nome do curso para adicionar: ");
                        userString = scanner.next();
                        coursesList.add(userString);
                        break;
                    case 2:
                        System.out.print("Digite nome do professor para adicionar: ");
                        userString = scanner.next();
                        professorsList.add(userString);
                        break;
                    case 3:
                        showCourses();
                        break;
                    case 4:
                        showProfessors();
                        break;
                    case 5:
                        showCourses();
                        if (coursesList.isEmpty()) {
                            break;
                        } else {
                            System.out.print("Digite número a ser removido: ");
                            userOption = scanner.nextInt();
                            coursesList.remove(userOption);
                            break;
                        }
                    case 6:
                        showProfessors();
                        if (professorsList.isEmpty()) {
                            break;
                        } else {
                            System.out.print("Digite número a ser removido: ");
                            userOption = scanner.nextInt();
                            professorsList.remove(userOption);
                            break;
                        }
                    case 7:
                        showFinishedCourses();
                        break;
                    case 8:
                        showCourses();
                        if (coursesList.isEmpty()) {
                            break;
                        } else {
                            System.out.print("Digite número do curso para marcar como concluído: ");
                            userOption = scanner.nextInt();
                            String courseRemoved = coursesList.remove(userOption);
                            finishedCoursesList.add(courseRemoved);
                            break;
                        }
                }
             } catch (InputMismatchException e ){
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

    }

    public static void printMenuOptions() {
        System.out.println(
                "- - - - - [ Sistema Curso/Professor ]- - - - -\n" +
                        "1. Adicionar curso ao sistema\n" +
                        "2. Adicionar professor ao sistema\n" +
                        "3. Listar cursos existentes\n" +
                        "4. Listar professores existentes\n" +
                        "5. Remover curso do sistema\n" +
                        "6. Remover professor do sistema\n" +
                        "7. Listar cursos concluídos\n" +
                        "8. Marcar um curso como concluído\n" +
                        "0. Sair\n" +
                        "- - - - - - - - - - - - - - - - - - - - - -"
        );
    }

    public static void showCourses() {
        if (coursesList.isEmpty()) {
            System.out.println("Lista de cursos vazia! Nenhum curso adicionado.");
        } else {
            System.out.println("Lista de cursos: ");
            int i = 0;
            for (String course: coursesList) {
                System.out.println(i + ". " + course);
                i++;
            }
        }
    }

    public static void showProfessors() {
        if (professorsList.isEmpty()) {
            System.out.println("Lista de professores vazia! Nenhum professor adicionado.");
        } else {
            System.out.println("Lista de professores: ");
            int i = 0;
            for (String professor: professorsList) {
                System.out.println(i + ". " + professor);
                i++;
            }
        }
    }

    public static void showFinishedCourses() {
        if (finishedCoursesList.isEmpty()) {
            System.out.println("Lista de cursos concluídos está vazia! Nenhum curso concluído ainda.");
        } else {
            System.out.println("Lista de cursos concluídos: ");
            int i = 0;
            for (String finishedCourse: finishedCoursesList) {
                System.out.println(i + ". " + finishedCourse);
                i++;
            }
        }
    }

    public static void printEndMessage() {
        System.out.println("Você escolheu sair. Encerrando o sistema.");
    }
}
