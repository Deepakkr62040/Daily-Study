package Java.basic;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the marks : ");
        int marks=sc.nextInt();
        
        if (marks > 100 || marks < 0) {
            System.out.println("Invalid marks! Please enter valid marks between 0 and 100.");
        } else if (marks >= 80) { 
            System.out.println("You passed!, " + marks + " Grade A");
        } else if (marks >= 70) { 
            System.out.println("You passed!, " + marks + " Grade B");
        } else if (marks >= 60) { 
            System.out.println("You passed!, " + marks + " Grade C");
        } else if (marks >= 50) { 
            System.out.println("You passed!, " + marks + " Grade D");
        }
        else {
            System.out.println("You failed. " + marks + " Grade NO");
        }
        sc.close();
    }
}
