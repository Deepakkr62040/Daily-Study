import java.util.Scanner;

public class Day5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the array is: ");
		int size = sc.nextInt();
		int []arr = new int[size];
		
		for(int i = 1; i < size; i++){
			arr[i] = sc.nextInt();
		}
		int max = 0;
		for(int j = 0; j < size; j++){
			if(max < arr[j]){
				max = arr[j];
			}
		}
		System.out.println(max);
		
		
        sc.close();
    }
}
//6
		//20 30 50 43 95 5