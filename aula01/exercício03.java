import java.util.Scanner;
public class exercicio03 {

    public static void main(String[] args) {

        double primeiroNumero, segundoNumero, terceiroNumero, maxValor, minValor, mediaAritmetica;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        primeiroNumero = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        segundoNumero = scanner.nextDouble();

        System.out.println("Digite o terceiro número: ");
        terceiroNumero = scanner.nextDouble();

        if (primeiroNumero > segundoNumero) {
            if (primeiroNumero > terceiroNumero) {
                maxValor = primeiroNumero;
            } else {
                maxValor = terceiroNumero;
            }
        } else {
            if (segundoNumero > terceiroNumero) {
                maxValor = segundoNumero;
            } else {
                maxValor = terceiroNumero;
            }
        }
        if (primeiroNumero < segundoNumero) {
            if (primeiroNumero < terceiroNumero) {
                minValor = primeiroNumero;
            } else {
                minValor = terceiroNumero;
            }
        } else {
            if (segundoNumero < terceiroNumero) {
                minValor = segundoNumero;
            } else {
                minValor = terceiroNumero;
            }
        }

        mediaAritmetica = (primeiroNumero + segundoNumero + terceiroNumero) / 3.0;

        System.out.println("O maior número é: " + maxValor);
        System.out.println("O menor número é: " + minValor);
        System.out.println("A média aritmética é: " + mediaAritmetica);

        scanner.close();
    }
}
