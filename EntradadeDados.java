import java.util.Scanner;

public class EntradadeDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numeroInt = scanner.nextInt();

        System.out.println("Digite um número decimal: ");
        double numeroDouble = scanner.nextInt();

        double soma = numeroInt + numeroDouble;
        System.out.println("A soma dos números é: " +soma);
    }
}
