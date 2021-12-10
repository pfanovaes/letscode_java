package br.com.letscode.aula2;

public interface TiposPrimitivos {
    static void main(String[] args) {
        String nome = "Patricia";
        var sobrenome =  "Novaes";
        int idade =  42;

        String frase1 = "A " + nome + " " + sobrenome + " tem " + idade +" anos de idade";

        System.out.println(frase1);

        String frase2 = String.format("a %s %s tem %d anos de idade", nome, sobrenome, idade);

        System.out.println(frase2);

        System.out.println(frase2.equals(frase1));
        System.out.println(frase2.equalsIgnoreCase(frase1));
        System.out.println(frase1.toUpperCase()); //gera uma nova string

        frase1 = frase1.toUpperCase(); //pra alterar a frase1 para Uppercase

        System.out.println(frase1.indexOf("ANOS"));
        System.out.println(frase1.substring(frase1.indexOf("ANOS")));
    }
}
