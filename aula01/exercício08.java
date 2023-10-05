import java.util.Scanner;

public class exercicio08{

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção:");
        System.out.println(" 1- Gestante");
        System.out.println(" 2- Idoso");
        System.out.println(" 3- Pessoa com deficiência (PCD)");
        System.out.println(" 4- Nenhuma das alternativas");

        int opcao = scanner.nextInt();

        switch (opcao){

            case 1:
                System.out.println("Você tem direito à fila priopritária como gestante.");
                break;

            case 2:
                System.out.println("Você tem direito á fila proprietária como idoso.");
                break;

            case 3:
                System.out.println("Você tem direito à fila proprietária como pessoa com deficiência(PCD).");
                break;

            case 4:
                System.out.println("Você não tem direito à fila proprietária.");
                break;

            default:
                System.out.println("Opção inválida.");

        }
        scanner.close();
    }
}
