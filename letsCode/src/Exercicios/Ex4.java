package Exercicios;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        /*
        Escreva um programa que lê 5 números e informa o maior, o menor e a média deles.
         */

        Scanner scan = new Scanner(System.in);


        int num;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;


        for (int i=0; i<5; i++){

            System.out.println("Entre com um número:");
            num = scan.nextInt();

            if (num > maior){
                maior = num;
                //System.out.println("o número maior mudou: " + maior);
            }

            if (num < menor) {
                menor = num;
            }

        }
        int media = (maior + menor) / 2;
        System.out.println("O maior número digitado foi: " + maior);
        System.out.println("O menor número digitado foi: " + menor);
        System.out.println("A média do maior e menor numero foi: " + media);
    }
}
