package Exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome de uma fruta:");
        String fruta1 = scan.next();
        System.out.println("Digite o nome de outra fruta");
        String fruta2 = scan.next();
        System.out.println("Digite o nome de outra fruta");
        String fruta3 = scan.next();
        System.out.println("Digite o nome de outra fruta");
        String fruta4 = scan.next();
        System.out.println("Digite o nome de outra fruta");
        String fruta5 = scan.next();

        String[] carrinhoCompras = new String[] {fruta1, fruta2, fruta3, fruta4, fruta5 };


        System.out.println(Arrays.toString(carrinhoCompras));
    }
}
