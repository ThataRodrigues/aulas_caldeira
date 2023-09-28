import java.util.Scanner;

public class exercise01 {

    /**
     * Exercicio 01
     * Crie um programa que determine e escreva os números primos compreendidos entre um intervalo fornecido
     * pelo usuário.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Determina números primos no intervalo que você quiser ");

        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int segundoNumero = scanner.nextInt();

        System.out.println("Intervalo escolhido [ " + primeiroNumero + " , " + segundoNumero + " ]");
        System.out.println("Números primos: ");

        for (int i = primeiroNumero; i <= segundoNumero; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }public static boolean isPrime(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= numero - 1; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }public static boolean isPrimeUpgrade (int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }public static boolean isPrimeUltimate(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
