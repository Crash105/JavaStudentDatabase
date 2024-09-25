package database;

import java.util.Random;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance;
    private static int costOfCourse = 600;
    private static int id = 1000;
    // static is speciifc to not one object but all objects

    public Student() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter FirstName: ");
        this.firstName = scan.nextLine();
        System.out.print("Enter LastName: ");
        this.lastName = scan.nextLine();
        System.out.println("Enter Grade Year:\n1 - Freshment\n2 for Sophmore\n3 for Junior\n4 for Senior");
        this.gradeYear = scan.nextInt();

        id++;
        setStudentID();

    }

    public void setStudentID() {

        this.studentID = gradeYear + "" + id;

    }

    public void addCourse() {

        do {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Courses(Press Q to Quit): ");
            String course1 = scan.nextLine();
            if (!course1.equals("Q")) {
                if (course1.equals("History 101") || course1.equals("Math 101") || course1.equals("English 101")
                        || course1.equals("Chemisty 101") || course1.equals("Computer Science 101")) {
                    courses = courses + " , " + course1;
                    tuitionBalance = tuitionBalance + 600;
                } else {
                    System.out.println("Course does not exist, enter the available classes");

                }
            } else {
                System.out.println("End ");
                break;
            }
        } while (1 != 0);

    }

    public void payTution() {
        System.out.println("Enter your payment");
        Scanner scan = new Scanner(System.in);
        int pay = scan.nextInt();
        tuitionBalance = tuitionBalance - pay;
        System.out.println("Thank you for your payment of: " + pay);
        System.out.println(viewBalance());
    }

    public int viewBalance() {
        return tuitionBalance;
    }

    public String getBalance() {
        return "Your balance is: $ " + tuitionBalance;
    }

    public String showInfo() {
        return "FirstName: " + firstName + "\nLastName: " + lastName + "\nGradeYear: " + gradeYear + "\nID: "
                + studentID + "\nCourses Enrolled: "
                + courses + "\nTution Balance: " + tuitionBalance;
    }

}