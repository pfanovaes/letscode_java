package Exercicios;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Ex3 {
    /*
    Escreva um programa que lê 5 números. Ao final, escreva primeiros todos os ímpares, depois todos os pares.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número");
        int num1 = scan.nextInt();
        System.out.println("Digite outro número");
        int num2 = scan.nextInt();
        System.out.println("Digite outro número");
        int num3 = scan.nextInt();
        System.out.println("Digite outro número");
        int num4 = scan.nextInt();
        System.out.println("Digite outro número");
        int num5 = scan.nextInt();

        int[] numeros = new int[5];
        numeros[0] = num1;
        numeros[1] = num2;
        numeros[2] = num3;
        numeros[3] = num4;
        numeros[4] = num5;

        for (int i = 1; i <= numeros.length; i++) {

            if (i % 2 != 0) {
                System.out.println("Numeros impares: " + i);
            }
        }

        for (int i = 1; i <= numeros.length; i++) {

            if (i % 2 == 0) {
                System.out.println("Numeros pares: " + i);
            }
        }


    }
}
