package Java.dataType;

import java.util.Scanner;

public class IfElseAge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the number : ");
        int age=sc.nextInt();
        if(age>18){
            System.out.println("Congrats for being a major");
        } else if(age == 18) {
            System.out.println("Neither Minor or Major");
        } else {
            System.out.println("You pity minor");
        }
        sc.close();
    }
}
