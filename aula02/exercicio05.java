import java.util.Scanner;

public class exercise05 {

    /**
     * Exercicio 05
     * Escreva um programa que separa a string em duas metades e imprime a primeira parte.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase ou uma palavra: ");
        String input = scanner.nextLine();

        String halfInput = input.substring(0, (input.length() / 2));

        if (input.length() % 2 == 0) {
            System.out.println("Metade do seu texto: " + halfInput);
        } else {
            System.out.println("Seu texto não pode ser dividido em partes iguais");
            System.out.println("Metade aproximada do seu texto: " + halfInput);
        }

        scanner.close();
    }
}
