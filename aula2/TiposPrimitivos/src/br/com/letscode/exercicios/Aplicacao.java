package br.com.letscode.exercicios;

public class Aplicacao {
    public static void main(String[] args) {
        int numeroUm = Integer.parseInt(args[0]);
        int numeroDois = Integer.parseInt(args[1]);
        System.out.println("A soma dos números é " + (numeroUm+numeroDois));
        System.out.println("A subtração dos números é " + (numeroUm-numeroDois));
        System.out.println("A multiplicação dos números é " + (numeroUm*numeroDois));
        System.out.println("A divisão dos números é " + (numeroUm/numeroDois));
    }


}
