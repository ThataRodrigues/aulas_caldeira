import java.util.Scanner;

public class exercicio07{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite seu salário: ");
        double salario = scanner.nextDouble();

        if( idade >=18 && salario >2000.00){
            System.out.println("Pode comprar um automóvel!!");
        }else{
            System.out.println("Não pode comprar um automóvel. Você tem menos que 18 anos ou não tem verba o suficiente." );
        }
       scanner.close();
    }
}
