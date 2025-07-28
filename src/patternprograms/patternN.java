/**
 * 
 */
package patternprograms;

import java.util.Scanner;

/**
 * @author Yashaswini B M
 * @category pattern
 * @description This is an example for the conditional patterns to print letter 'N'.
/**
 * 
 */
public class patternN {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
        	for (int j = 0; j < n; j++) {
        		if(j==0 || j==(n-1) || i==j) {
        			System.out.print("* ");
        		}else {
        			System.out.print("  ");
        		}
        	}
        	System.out.println();
        }

	}

}
