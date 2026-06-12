import java.util.Scanner;

public class Day5Sum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < size; i++) {
            sum = sum + arr[i];
			System.out.println("Sum of all elements are: " + sum);
		}

        sc.close();
    }
}