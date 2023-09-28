import java.util.Scanner;

public class exercise11 {

    /**
     * Exercicio 11:
     * Peça ao usuário que digite uma palavra ou frase e conte quantas vogais
     * (a, e, i, o, u) estão presentes. Exiba o número de vogais na tela.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra ou frase:");

        String entrada = scanner.nextLine().toLowerCase();

        int vowelCounter = 0;

        for (int i = 0; i < entrada.length(); i++) {
            char letter = entrada.charAt(i);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                vowelCounter++;
            }
        }

        System.out.println("O número de vogais na palavra ou frase é: " + vowelCounter);

        scanner.close();
    }
}
