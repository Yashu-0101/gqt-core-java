package patternprograms;
import java.util.Scanner;
public class class34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter Size: ");
	        int n = sc.nextInt();

	        // Top half
	        for (int i = 1; i <= n; i++) {
	            // Leading spaces
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }

	            System.out.print(i); // First number

	            if (i > 1) {
	                // Inner spaces
	                for (int j = 1; j <= (2 * i - 3); j++) {
	                    System.out.print(" ");
	                }
	                System.out.print(i); // Second number
	            }

	            System.out.println();
	        }

	        // Bottom half
	        for (int i = n - 1; i >= 1; i--) {
	            // Leading spaces
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }

	            System.out.print(i); // First number

	            if (i > 1) {
	                // Inner spaces
	                for (int j = 1; j <= (2 * i - 3); j++) {
	                    System.out.print(" ");
	                }
	                System.out.print(i); // Second number
	            }

	            System.out.println();
	        }

	}

}
