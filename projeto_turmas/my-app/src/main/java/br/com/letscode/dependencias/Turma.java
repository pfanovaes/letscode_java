package br.com.letscode.dependencias;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

@RequiredArgsConstructor
public class Turma {
    @NonNull
    @Getter
    private String name;
    @NonNull
    private String filePath;
    @Getter
    private int totalStudents = 0;
    @Getter
    private List<String> studentList = new ArrayList();

    public void readClassFile() {
        try (BufferedReader input = new BufferedReader(new FileReader(this.filePath))) {
            String student;
            while ((student = input.readLine()) != null) {
                if (StringUtils.contains(student, ". ")) {
                    student = StringUtils.substringAfter(student, ". ");
                }
                this.studentList.add(student);
                this.totalStudents++;
            }
        } catch (IOException e) {
            System.out.println(this.name + "!!student list file not found!!");;
        }
        Collections.sort(this.studentList);
    }

    public void printClassData() {
        try (BufferedWriter output = new BufferedWriter(new FileWriter((this.name + ".txt")))) {
            output.write("CLASS NAME: " + this.name);
            output.newLine();
            output.write("CLASS SIZE: " + this.totalStudents + " students");
            output.newLine();
            output.write("STUDENTS LIST:");
            output.newLine();
            for (String student : this.studentList) {
                output.write(student);
                output.newLine();
            }
        } catch (IOException e) {
            System.out.println("Couldn't create " + this.name + "output data file");
        }
    }

}
