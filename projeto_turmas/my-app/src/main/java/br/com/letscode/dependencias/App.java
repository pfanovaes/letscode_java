package br.com.letscode.dependencias;


public class App {
    public static void main( String[] args ) {
        Turma javaClass = new Turma("Turma Java", "src/main/resources/Turma Java.txt");
        javaClass.readClassFile();
        javaClass.printClassData();
        Turma bdClass = new Turma("Turma Banco de Dados", "src/main/resources/Turma Banco de Dados.txt");
        bdClass.readClassFile();
        bdClass.printClassData();
        ImprimirDados.printTxt(javaClass.getStudentList(), bdClass.getStudentList());
    }
}
