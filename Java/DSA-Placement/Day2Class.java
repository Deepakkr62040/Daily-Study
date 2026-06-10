import java.util.Scanner;

class Day2Class{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Side 1");
		int side1 = sc.nextInt();
		
		System.out.println("Side 2");
		int side2 = sc.nextInt();
		
		System.out.println("Side 3");
		int side3 = sc.nextInt();
		
		System.out.println("Equilateral Triangle");
		int Perimeter = side1 + side2 + side3;
		
		System.out.println("Perimeter of Equilateral Triangle: " + Perimeter);
		
		if(side1 == side2 && side2 == side3 && side3 == side1){
			System.out.println("Equilateral Triangle");
		}
		
		else if(side1 == side2 || side2 == side3 || side3 == side1){
			System.out.println("Isosceles Triangle");
		}
		else{
			System.out.println("Scalene Triangle");
		}
	}
}