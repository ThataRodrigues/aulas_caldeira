import java.util.Scanner;

public class exercicio13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero >= 0) {
            long fatorial = 1;

            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }else{
            System.out.println("O número não pode ser negativo.");
        }
        scanner.close();
    }
}
