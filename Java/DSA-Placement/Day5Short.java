import java.util.Scanner;

public class Day5Short{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the n(size) of the first array: ");
        int n1 = sc.nextInt();
		int arr1[] = new int[n1];
		
		for(int i = 0; i < n1; i++){
			arr1[i] = sc.nextInt();
		}
		
		System.out.print("Enter the n(size) of the first array: ");
        int n2 = sc.nextInt();
		int arr2[] = new int[n2];
		
		for(int i = 0; i < n2; i++){
			arr2[i] = sc.nextInt();
		}
		
		int i = 0;
		int j = 0;
		
		while(i < n1 && j < n2){
			if(arr1[i] < arr2[j]){
				System.out.print(arr1[i] + " ");
				i++;
			} else {
				System.out.print(arr2[j] + " ");
				j++;
			}
		}
		
		//print the remain elements in the array
		while(i < n1){
			System.out.print(arr1[i] + " ");
			i++;
		}
		//print the remain elements in the array
		while(j < n2){
			System.out.print(arr2[j] + " ");
			j++;
		}
		
		//System.out.print(arr2[j] + " ");
		//print the remain elements in the specific array....

        sc.close();
    }
}


		//int arr1[] = {60, 180, 300};
		//int arr2[] = {90, 240, 360};