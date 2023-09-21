import java.util.Scanner;

public class exercise05 {

    /**
     * Exercicio 05:
     * Crie um programa que armazene um horário (hora, minuto e segundo) em variáveis, depois,
     * determine e exiba a quantidade de segundos que se passaram desde as 0h00min0s e
     * a quantidade de segundos que faltam para a meia-noite.
     */

    public static void main(String[] args) {

        int hour, minute, second;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a hora [0-23]: ");

        hour = scanner.nextInt();

        System.out.println("Digite os minutos [0-59]: ");
        minute = scanner.nextInt();

        System.out.println("Digite os segundos [0-59]: ");
        second = scanner.nextInt();

        if (hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59 && second >= 0 && second <= 59) {

            int secondsHavePassed = hour * 3600 + minute * 60 + second;
            int secondsLeft = 86400 - secondsHavePassed;

            System.out.println("Segundos passados desde 0h00min00s: " + secondsHavePassed);
            System.out.println("Segundos faltando para meia-noite: " + secondsLeft);
        } else {
            System.out.println("Entrada de tempo inválida.");
        }
        scanner.close();
    }
}
