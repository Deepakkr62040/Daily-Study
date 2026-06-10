import java.util.Scanner;

class Day2nestedif{
	public static void main(String args[]){
		int age = 100;
		if(age > 18){
			if(age < 100){
				System.out.println("It is in range 18 - 100");
			}
			else {
				System.out.println("Not in range");
			}
			System.out.println("out-side of inside if");
		}
		System.out.println("out-side of outside if");
	}
}