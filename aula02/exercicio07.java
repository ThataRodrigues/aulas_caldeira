import java.util.Scanner;

public class exercise07 {

    /**
     * Exercicio 07
     * Criar um jogo de adivinhação para descobrir quantos soldados os 300 espartanos irão enfrentar.
     * Leônidas pede para que seus soldados tentem adivinhar quantos inimigos irão combater.
     * O usuário deve digitar seu palpite e se o número for menor do que 300.000, Leônidas deve dizer Um pouco mais!,
     * caso o número dito pelo usuário seja menor, ele dirá Um pouco menos!".
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;

        while (i <= 5) {
            System.out.println("Digite um número: ");
            double valor = scanner.nextDouble();
            if (valor < 300000)
                System.out.println("Leônidas diz: UM POUCO MAIS!");
            else
                System.out.println("Leônidas diz: UM POUCO MENOS!");
            i++;
        }

        scanner.close();
    }
}
