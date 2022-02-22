package br.com.letscode.exercicios;

import java.util.Scanner;

public class RealEmDolar {

    public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            double cotacao_dolar;
            double valor_dolar;
            double valor_real;
            System.out.print("Digite a cotação do dolar: ");
            cotacao_dolar = entrada.nextDouble();

            System.out.print("Digite o valor em real: ");
            valor_real = entrada.nextDouble();

            valor_dolar = valor_real / cotacao_dolar;

            System.out.print("O Valor da conversão de " + valor_real + " reais em dólares é $" + valor_dolar + " dólares" );

        }

    }

