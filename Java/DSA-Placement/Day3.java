import java.util.Scanner;

public class Day3 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
		
		for(int i = 1; i <= size; i++){
			for(int j = 1; j <= size; j++){
				System.out.print(i +" Hello " + j);
			}
			System.out.println();
		}

        sc.close();
    }
}