import java.util.Scanner;

public class Day4Array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		
		//datatype variable_name[];
		//int[] arr = {1, 2, 3, 4, 5};
		
		//for(int i = 0; i < 5; i++){
		//	System.out.println(arr[i]);
		//}
		
		int sub[] = new int [6];
		int size = sub.length; 
		
		sub[0] = 10;
		sub[1] = 20;
		sub[2] = 30;
		sub[3] = 40;
		sub[4] = 50;
		sub[5] = 60;
		
		System.out.println("index zero elements is: " + sub[0]);
		
		for(int i = 0; i < 6; i++){
			System.out.println(sub[i]);
		}
		System.out.println("Size of the array is : " +size);
		
		System.out.println("--------------------------------------------------------- ");
		
		System.out.println("Inset the elements in the array: ");
		for(int i = 0; i < 6; i++){
			sub[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("user enter of array elements are: ");
		for(int i = 0; i < 6; i++){
			System.out.println(sub[i]);
		}
		
		
		System.out.println("--------------------------------------------------------- \n");
		System.out.println("Size of the array is : " +size);
		
        sc.close();
    }
}

