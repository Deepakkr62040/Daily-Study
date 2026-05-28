package Java.dataType;

import java.util.Scanner;

public class IfElse {
    public void roadToChoose(){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number=sc.nextInt();
        if(number%3==0){
            System.out.println("The number is divisible by 3");
        }else if(number%7==0){
            System.out.println("the number is divisible by 7");
        }
        else{
            System.out.println("Number is divisible by");
        }
        
    sc.close();
    }

    public static void main(String[] args) {
        IfElse condition=new IfElse();
        condition.roadToChoose();
    }
}
