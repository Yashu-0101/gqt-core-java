package patternprograms;
import java.util.Scanner;
public class pattern37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            // Leading spaces to center-align
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  "); // 2 spaces
            }

            // Descending letters from current to 'A'
            for (char ch = (char) ('A' + i); ch >= 'A'; ch--) {
                System.out.print(ch + " ");
            }

            // Ascending letters from 'B' to current
            for (char ch = 'B'; ch <= (char) ('A' + i); ch++) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }

	}

}
