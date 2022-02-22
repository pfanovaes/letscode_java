package Exercicios;

import java.util.Scanner;

public class Ex2 {
    public static String reverse (String o) {
        String temporaria = "";
        for (int i = o.length() - 1; i >= 0; i--)
            temporaria += o.charAt(i);
        return temporaria;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma palavra");
        String palavra = scan.next();

        System.out.println(Ex2.reverse(palavra));
            }
        }


