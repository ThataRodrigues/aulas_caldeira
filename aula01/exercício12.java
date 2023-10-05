import java.util.Scanner;

public class exercicio12{

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor em dólares: ");
        double dolar = scanner.nextDouble();

        System.out.println("Digite a taxa de câmbio: ");
        double taxaCambio = scanner.nextDouble();

        double valorConvertido = dolar * taxaCambio;

        System.out.println("A quantia convertida é: "+ valorConvertido);

        scanner.close();
    }

}
