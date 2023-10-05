import java.util.Scanner;

public class exercicio05{

    public static void main(String[] args){

        int hora, minutos, segundos;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a hora: ");
        hora = scanner.nextInt();

        System.out.println("Digite os minutos: ");
        minutos = scanner.nextInt();

        System.out.println("Digite os segundos: ");
        segundos = scanner.nextInt();

        if(hora >= 0 && hora <=23 && minutos >= 0 && minutos <= 59 && segundos >= 0 && segundos <= 59){

            int segundosQuePassou = hora * 3600 + minutos * 60 + segundos;
            int segundosQueFaltam = 86400 - segundosQuePassou;

            System.out.println("Segundos que passou após a meia-noite: " + segundosQuePassou);
            System.out.println("Segundos que faltam para meia-noite: "+ segundosQueFaltam);
        }else{
            System.out.println("ERRO!! Tempo inválido.");
        }
        scanner.close();
    }
}
