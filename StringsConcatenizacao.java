import java.util.Scanner;

public class StringsConcatenizacao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String sobreNome = scanner.nextLine();

        System.out.println("Bem-vindo, " +nome+ " " +sobreNome+ "!");

    }
}
