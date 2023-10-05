import java.util.Scanner;

public class exercicio04 {

    public static void main(String[] args){

        double salarioMinimo = 1320.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do salário: ");
        double salario = scanner.nextDouble();

        double quantidade = salario / salarioMinimo;

        System.out.printf("Esse valor corresponde a %.2f salários mínimos.", quantidade);

        scanner.close();
    }

}
