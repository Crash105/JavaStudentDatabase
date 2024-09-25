package database;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many Students Do you want in your database");
        int numofStudents = scan.nextInt();

        Student[] students = new Student[numofStudents];

        for (int i = 0; i < numofStudents; i++) {
            students[i] = new Student();
            students[i].addCourse();
            students[i].payTution();
        }

        for (int i = 0; i < numofStudents; i++) {
            System.out.println(students[i].showInfo());

        }

    }
}
