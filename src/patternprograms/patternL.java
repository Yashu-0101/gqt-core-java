/**
 * 
 */
package patternprograms;

import java.util.Scanner;
/**
 * @author Yashaswini B M
 * @category pattern
 * @description This is an example for the conditional patterns to print letter 'L'.
/**
 * 
 */
public class patternL {

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
        		if(i==(n-1) || j==0) {
        			System.out.print("* ");
        		}else {
        			System.out.print("  ");
        		}
        	}
        	System.out.println();
        }

	}

}
