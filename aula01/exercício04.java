import java.util.Scanner;

public class exercise04 {

    /**
     * Exercicio 04:
     * Crie um programa que leia o valor do salário mínimo e o valor do salário de um usuário,
     * calcule a quantidade de salários mínimos que esse usuário ganha e imprima o resultado,
     * assuma que o salário mínimo é R$1.320.
     */

    public static void main(String[] args) {
        double minimumWage = 1320.0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do salário:");
        double wage = scanner.nextDouble();

        double quantity = wage / minimumWage;

        String formattedResult = String.format("%.2f", quantity);
        System.out.println("O usuário ganha " + formattedResult + " salários mínimos.");

        System.out.printf("O usuário ganha %.2f salários mínimos.", quantity);

        scanner.close();
    }
}
