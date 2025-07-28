package patternprograms;
import java.util.Scanner;
public class pattern35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size:");
		int n=sc.nextInt();
		for (int i = 0; i < n; i++) {
            // Leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }

            // Ascending characters
            for (char ch = 'A'; ch < 'A' + i + 1; ch++) {
                System.out.print(ch + " ");
            }

            // Descending characters
            for (char ch = (char) ('A' + i - 1); ch >= 'A'; ch--) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }

	}

}
