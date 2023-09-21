package com.github.javacaldeira;

import java.util.Scanner;

public class exercise06 {

    /**
     * Exercicio 06: Escreva um programa que leia a idade do usuário e imprima respostas diferentes
     * dependendo do número colocado:
     * Se for menor de 16 anos, avisar que não pode votar
     * Se tiver 16 ou 17, avisar que o voto é facultativo
     * Se tiver mais de 65, avisar que também é facultativo o voto
     * De 18 até 65, é obrigatório votar.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int age = scanner.nextInt();

        if (age < 16) {
            System.out.println("Você não pode votar.");
        } else if (age <= 17 || age > 65) {
            System.out.println("O voto é facultativo.");
        } else {
            System.out.println("O voto é obrigatório.");
        }
        scanner.close();
    }
}
