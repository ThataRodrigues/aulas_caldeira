import java.util.Scanner;

public class exercise06 {

    /**
     * Exercicio 06
     * Escreva um programa que receba uma string do usuário e imprima ela ao contrário.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase ou uma palavra: ");
        String input = scanner.nextLine();

        String reverseVersion = reverseTextV(input);
        System.out.println("A sua frase ou palavra ao contrário é: " + reverseVersion);

        scanner.close();
    }public static String reverseTextV(String text) {
        StringBuilder reverse = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            reverse.append(text.charAt(i));
        }
        return reverse.toString();
    }
}
