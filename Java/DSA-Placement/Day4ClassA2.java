import java.util.Scanner;

public class Day4ClassA2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array is: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		//insert elements into array
		for(int i = 0; i < size; i++){
			arr[i] =  sc.nextInt();
		}
		int duplicate = 0;
		boolean foundDup = false;
		
		//20, 10, 15, 6, 10
		for(int i = 0;i<size-1;i++){
			int max = arr[i +1];
			for(int j = i + 1; j < size; j++){
				if(arr[i] == arr[j]){
					foundDup = true;
					duplicate= arr[i];
				}
			}
			arr[i] = max;
		}
		if(foundDup){
			System.out.println("\nDuplicate value is : "+duplicate);
		} else {
			System.out.println("No Duplicate found");
		}
		
        sc.close();
    }
}

