import java.util.Scanner;

class Main1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Total rent pay system");
		
		double totalrent = sc.nextDouble();
		int people = sc.nextInt();
		double share = totalrent / people;
		double each = share + (share + 0.15);
		System.out.println(each); 
	}
}