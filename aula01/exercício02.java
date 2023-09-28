import java.util.Scanner;

public class exercise02 {

    /**
     * Exercicio 02:
     * Crie um programa que receba 2 números e imprima na tela.
     */

    public static void main(String[] args) {

        double primeiroNumero;
        double segundoNumero;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");

        primeiroNumero = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        segundoNumero = scanner.nextDouble();

        System.out.println("Primeiro número é: " + primeiroNumero);
        System.out.println("Segundo número é: " + segundoNumero);

        scanner.close();
    }
}
