import java.util.Scanner;

public class exercise13 {

    /**
     * Exercicio 13:
     * Escreva um programa que calcule o fatorial de um número inteiro não negativo fornecido pelo
     * usuário. O fatorial de um número N é o produto de todos os inteiros de 1 até N.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int number = scanner.nextInt();

        if (number >= 0) {
            long factorial = 1;

            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("O fatorial de " + number + " é: " + factorial);

        } else {
        System.out.println("O número não pode ser negativo.");
        }

        scanner.close();
    }
}
