import java.util.Scanner;

public class exercicio11{

        public static void main( String[]args){

            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite uma palavra ou uma frase: ");

            String entrada = scanner.nextLine().toLowerCase();
            int contadorVogais = 0;

            for( int i = 0; i < entrada.length(); i++){

                char letra = entrada.charAt(i);
                if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                    contadorVogais++;
                }
            }
            System.out.println("O número de vogais na palavra ou frase é: "+ contadorVogais);

            scanner.close();
        }
}
