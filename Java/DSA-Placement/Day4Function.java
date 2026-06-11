import java.util.Scanner;

public class Day4Function {
	static void great(String name, int roll, String add){
		System.out.println("Hello Welcome to parul.....\n"+"Name: " + name + "\n"+"Roll no: " + roll + "\n"+"Address: " + add);
	}

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		
		great("Parul", 1002, "Parul university");//Calling a method

        sc.close();
    }
}

//static returntype functionname(Paramaters){statements;}