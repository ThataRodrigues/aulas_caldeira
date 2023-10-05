import java.time.LocalDateTime;
import java.util.Scanner;

public class exercicio09{

    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();
        int ano = LocalDateTime.now().getYear();
        int idade = ano - anoNascimento;

        System.out.println("Você tem "+idade+" anos.");

        scanner.close();
    }
}
