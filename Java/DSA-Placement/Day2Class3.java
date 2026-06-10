import java.util.Scanner;
import java.util.Scanner;

class Day2Class3 {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
        int first = 0;
		int second = 1;
		int num = sc.nextInt();
		if (num == 1) {
			System.out.println(first);
		} else if(num == 2){
			System.out.println(first + " " + second);
		} else {
			System.out.println(first + " " + second);
			int i = 2;
			while( i < num){
				int sum = first+second;
				System.out.println(sum);
				int temp = second;
				second = sum;
				first = second;
				i++;
				
			}
		}
		
    }
}