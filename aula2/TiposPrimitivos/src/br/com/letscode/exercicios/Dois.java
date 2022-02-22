package br.com.letscode.exercicios;

import java.util.Scanner;

public class Dois {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.println("Digite um número: ");
        number = input.nextInt();

        if ( number > 0 && number <= 10) {
            for ( int i = 1; i <= 10; i++) {
                System.out.printf("A multiplicação de %d por %d é igual a %d. %n", number, i, (number * i));
            }
        }   else {
            System.out.println("Digite um número entre 1 e 10");
        }
    }
}
