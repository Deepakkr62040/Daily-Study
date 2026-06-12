import java.util.Scanner;

public class Day5Class {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the n of the array: ");
        int n = sc.nextInt();
		System.out.print("Enter the k of the box: ");
		int k = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}
		int totalsum = 0;
		for(int i = 0; i <=n-k; i++){
			int window= i+k-1;
			int sum=0;
			for(int j = i; j <= window; j++){
				sum += arr[j];
			}
			if(totalsum < sum){
				totalsum = sum;
			}
		}
		System.out.println(totalsum);

        sc.close();
    }
}