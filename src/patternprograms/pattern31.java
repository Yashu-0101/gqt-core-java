package patternprograms;
import java.util.Scanner;
public class pattern31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size:");
		int n=sc.nextInt();
		 for (int i = 0; i <= n; i++) {
	            // Print leading spaces to center-align
	            for (int j = 0; j < n - i; j++) {
	                System.out.print("  ");  // 2 spaces per step
	            }

	            // Descending part
	            for (int j = i; j >= 0; j--) {
	                System.out.print(j + " ");
	            }

	            // Ascending part
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j + " ");
	            }

	            System.out.println();
	        }
		
	}

}
