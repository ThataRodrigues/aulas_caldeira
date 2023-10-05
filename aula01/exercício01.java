import java.util.Scanner;

public class exercicio01{

    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("O nome digitado é: "+nome);

        scanner.close();
    }
}
