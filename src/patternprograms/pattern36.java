package patternprograms;
import java.util.Scanner;
public class pattern36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }

            // Starting character: 1st row = A, 2nd = C, 3rd = E, etc.
            char ch = (char) ('A' + i * 2);

            // Print descending characters from ch to A
            for (char c = ch; c >= 'A'; c--) {
                System.out.print(c + " ");
            }

            System.out.println();
        }

	}

}
