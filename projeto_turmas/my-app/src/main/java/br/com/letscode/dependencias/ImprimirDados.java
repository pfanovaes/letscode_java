package br.com.letscode.dependencias;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ImprimirDados {
    public static void printTxt(List<String> class1, List<String> class2) {
        Set<String> allSchoolData = new TreeSet();
        allSchoolData.addAll(class1);
        allSchoolData.addAll(class2);
        try (BufferedWriter output = new BufferedWriter(new FileWriter(("School Complete Data.txt")))) {
            output.write("TOTAL NUMBER OF STUDENTS: " + allSchoolData.size() + " students");
            output.newLine();
            output.write("FULL STUDENTS LIST:");
            output.newLine();
            for (String student : allSchoolData) {
                output.write(student);
                output.newLine();
            }
        } catch (IOException e) {
            System.out.println("!!Fail creating the full data from school!!");
        }
    }
}
