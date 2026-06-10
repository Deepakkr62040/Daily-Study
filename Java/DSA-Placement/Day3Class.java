import java.util.Scanner;

public class Day3Class {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of pattern: ");
		 int n = sc.nextInt();
		 int size = 2*n-1;
		 int center = n-1;
		 
		 for(int i = 0; i < size; i++){
			 for(int j = 0; j < size; j++){
				int  top = i;
				int left = j;
				int bottom = size - i - 1;
				int right = size - j - 1;
				 
				int min = Math.min(
					Math.min(top, left),
					Math.min(bottom, right)
				);
				 
				 
				 System.out.print(n-min + " ");
			 }
			 System.out.println();
		 }

        sc.close();
    }
}	