import java.util.Scanner;

public class exercicio10{

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Graus Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit =  (celsius * 9 / 5)+ 32;

        System.out.println("A temperatura em Graus Fahrenheit é: "+ fahrenheit);

        scanner.close();
    }

}
