import java.util.Scanner;

public class Day5Short1{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		
		while(testCases --> 0){
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i = 0; i < n; i++){
				arr[i] = sc.nextInt();
			}
			int ind = 0;
			int sum = 0;
			for(int i = 1; i < n; i++){
				int diff= arr[i]-arr[i-0];
				if(diff > sum){
					ind = i;
					sum = diff;
				}
			}
			System.out.println(ind+1);
		} 
		
       
        sc.close();
    }
}