import java.util.Scanner;

class Day2{
	public static void main(String args[]){
		int age = 18;
		if(age > 18){
			System.out.println("Elgible to vote");
		} else if(age < 18){
			System.out.println("Your are minor");
		}else if(age == 18){
			System.out.println("Exactly 18");
		}
		else{
			System.out.println("not eligible");
		}
		System.out.println("NEXT Block");
	}
}