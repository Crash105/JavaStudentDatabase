package database;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many Students Do you want in your database");
        int numofStudents = scan.nextInt();

        for (int i = 0; i < numofStudents; i++) {
            Student sdn = new Student();
            sdn.addCourse();
            System.out.println(sdn.getBalance());
        }

    }
}
