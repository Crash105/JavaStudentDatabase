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

    public Student() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter FirstName: ");
        this.firstName = scan.nextLine();
        System.out.print("Enter LastName: ");
        this.lastName = scan.nextLine();
        System.out.println("Enter Grade Year:\n1 - Freshment\n2 for Sophmore\n3 for Junior\n4 for Senior");
        this.gradeYear = scan.nextInt();

        studentID = generateID();
        id++;

    }

    public String generateID() {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*";
        Random rand = new Random();
        StringBuilder sb1 = new StringBuilder("");
        sb1.append(gradeYear);
        for (int i = 0; i < 4; i++) {
            int rand_int = rand.nextInt(70);
            sb1.append(passwordSet.charAt(rand_int));
        }
        String newpassword = sb1.toString();

        return newpassword;

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

    public void payTution(int pay) {
        tuitionBalance = tuitionBalance - pay;
    }

    public int viewBalance() {
        return tuitionBalance;
    }

    public String getBalance() {
        return "Your balance is: $ " + tuitionBalance;
    }

    public String showInfo() {
        return "FirstName: " + firstName + "\nLastName: " + lastName + "\nID" + studentID + "\nCourses Enrolled: "
                + courses + "\nTution Balance: " + tuitionBalance;
    }

}