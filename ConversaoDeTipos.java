public class ConversaoDeTipos {
    public static void main(String[] args) {
        double valorDouble = 9.99;
        int valorInt = (int)valorDouble; // Conversão Explícita de double para int

        int numero = 10;
        double numeroConvertido = numero; // Conversão Implícita de int para double

        System.out.println("Valor Double: " +valorDouble);
        System.out.println("Valor convertido para int: " +valorInt);
        System.out.println("Número Int: " +numero);
        System.out.println("Número convertido para double: " +numeroConvertido);
    }
}
