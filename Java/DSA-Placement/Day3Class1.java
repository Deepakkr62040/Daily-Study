import java.util.*;

public class Day3Class1 {

    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		while(num > 0){
			int rem = num % 10;
			System.out.println(rem);
			num = num/10;
		}
    }
}	