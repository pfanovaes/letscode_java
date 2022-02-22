package Exercicios;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        /*
        Escreva um programa que lê o nome de 5 pessoas e armazena numa lista de convidados. Ao final, informe qual o nome mais longo presente na lista.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um nome:");
        String nome1 = scan.next();
        System.out.println("Digite outro nome:");
        String nome2 = scan.next();
        System.out.println("Digite outro nome:");
        String nome3 = scan.next();
        System.out.println("Digite outro nome:");
        String nome4 = scan.next();
        System.out.println("Digite outro nome:");
        String nome5 = scan.next();



        String [] listaConvidados = new String[5];
        listaConvidados[0] = nome1;
        listaConvidados[1] = nome2;
        listaConvidados[2] = nome3;
        listaConvidados[3] = nome4;
        listaConvidados[4] = nome5;


        

    }
}
