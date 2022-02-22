package br.com.letscode.exercicios;

import java.util.Scanner;

public class PolegadasEmCentimetros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double polegadas;
        double centimetros;


        System.out.print("Digite o número em polegadas: ");
        polegadas = entrada.nextDouble();

        centimetros = polegadas * 2.54;

        System.out.print("O Valor de " + polegadas + " polegadas em centímetros é " + centimetros + "cm" );

    }

}
