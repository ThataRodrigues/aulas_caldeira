import java.util.Scanner;

public class exercise04 {

    /**
     * Exercicio 04
     * Implemente uma calculadora, onde o usuário deve entrar com 2 números e escolher a operação que deseja realizar.
     * Durante a execução o programa deve perguntar ao usuário se ele deseja continuar,
     * se ele não quiser, deve digitar ‘n’ para o programa encerrar.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepGoing = true;

        while (keepGoing) {
            System.out.println("***** CALCULADORA BÁSICA *****");

            System.out.println("Digite o primeiro número:");
            double primeiroNumero = scanner.nextDouble();
            System.out.println("Digite o segundo número:");
            double segundoNumero = scanner.nextDouble();

            scanner.nextLine();

            System.out.println("Digite a operação que você quer executar:");
            System.out.println(" + para Adição ");
            System.out.println(" - para Subtração ");
            System.out.println(" * para Multiplicação ");
            System.out.println(" / para Divisão ");
            System.out.println("'n' ou 'N' para encerrar. ");
            String option = scanner.nextLine().toLowerCase();
            double resultado;
            switch (option) {
                case "+" -> {
                    resultado = primeiroNumero + segundoNumero;
                    System.out.println(primeiroNumero + " + " + segundoNumero + " = " + resultado);
                }
                case "-" -> {
                    resultado = primeiroNumero - segundoNumero;
                    System.out.println(primeiroNumero + " - " + segundoNumero + " = " + resultado);
                }
                case "*" -> {
                    resultado = primeiroNumero * segundoNumero;
                    System.out.println(primeiroNumero + " * " + segundoNumero + " = " + resultado);
                }
                case "/" -> {
                    if (segundoNumero != 0.0) {
                        resultado = primeiroNumero / segundoNumero;
                        System.out.println(primeiroNumero + " / " + segundoNumero + " = " + resultado);
                    } else {
                        System.out.println("Erro: Divisão por zero.");
                    }
                }
                case "n" -> {
                    System.out.println("Tchau! Volte sempre.");
                    keepGoing = false;
                }
                default -> System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }
}
