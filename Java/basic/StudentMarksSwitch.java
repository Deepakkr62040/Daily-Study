package Java.basic;

import java.util.Scanner;

public class StudentMarksSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the marks : ");
        int marks = sc.nextInt();

        if (marks > 100 || marks < 0) {
            System.out.println("Invalid marks! Please enter valid marks between 0 and 100.");
        } else {

            int grade = marks / 10;   // Convert marks into range

            switch (grade) {

                case 10:
                case 9:
                case 8:
                    System.out.println("You passed!, " + marks + " marks" + " Grade A");
                    break;

                case 7:
                    System.out.println("You passed!, " + marks + " marks" +  " Grade B");
                    break;

                case 6:
                    System.out.println("You passed!, " + marks +  " marks" + " Grade C");
                    break;

                case 5:
                    System.out.println("You passed!, " + marks +  " marks" + " Grade D");
                    break;

                default:
                    System.out.println("You failed. " + marks +  " marks" + " Grade NO because you need at least 50 marks to pass.");
            }
        }

        sc.close();
    }
}
