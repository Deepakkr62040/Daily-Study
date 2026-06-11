import java.util.Scanner;

public class Day4ArrayString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		
		
		String sub[] = new String [6];
		int size = sub.length; 
		
		System.out.println("--------------------------------------------------------- ");
		
		System.out.println("Inset the elements in the array: ");
		for(int i = 0; i < 6; i++){
			sub[i] = sc.nextLine();
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

