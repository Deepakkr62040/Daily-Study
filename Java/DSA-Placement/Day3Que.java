import java.util.Scanner;

public class Day3Que {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

		System.out.print("Enter number: ");
		int number = sc.nextInt();
        
		if(number % 2 == 0){
			System.out.print("Even number");
			int n = number;
			
			while(n >= 10){
				int sum = 0;
				while(n > 0){
					sum += n % 10;
					n /= 10;
				}
				n = sum;
			}
			System.out.println(n);
		} else {
			System.out.println("odd number");
		}
	
        sc.close();
    }
}