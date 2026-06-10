import java.util.Scanner;

class Day2TernaryOp{
	public static void main(String args[]){
		int age = 8;
		System.out.println("Input age is " + age);
		//(condition) ? (true statement): (false expression);
		age = (age != 10) ? 20: 30;
		System.out.println(age);
	}
}