import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma, sub, div, mod;

        System.out.println("Digite o primeiro número inteiro: ");
        int primeiroInt = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int segundoInt = scanner.nextInt();

        soma = primeiroInt + segundoInt;
        sub = primeiroInt - segundoInt;
        div = primeiroInt / segundoInt;
        mod = primeiroInt % segundoInt;

        System.out.println("Resultado: " + soma);
        System.out.println("Resultado: " + sub);
        System.out.println("Resultado: " + div);
        System.out.println("Resultado: " + mod);

    }
}
