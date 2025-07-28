package patternprograms;

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
        	for (int j = 0; j < n; j++) {
        		System.out.print("  ");
        		if(i==0 || j==(n/2) ) {
        			
        			System.out.print("* ");
        		}else {
        			System.out.print("  ");
        		}
        	}
        	System.out.print("  ");
        	for (int j = 0; j < n; j++) {
        		if(j==0 || j==n-1 || i==(n/2)) {
        			System.out.print("* ");
        		}else {
        			System.out.print("  ");
        		}
        	}
        	System.out.print("  ");
        	for (int j = 0; j < n; j++) {
        		if((j==0 && i>=(n/2)) || i+j==(n/2) || j-i==(n/2) || (j==n-1 && i>=(n/2)) || i==(n/2) ) {
        			System.out.print("* ");
        		}else {
        			System.out.print("  ");
        		}
        	}
        	System.out.print("  ");
        	for (int j = 0; j < n; j++) {
        		if(j==0 || j==(n-1) || i==j) {
        			System.out.print("* ");
        		}else {
        			System.out.print("  ");
        		}
        	}
        	System.out.print("  ");
        	for (int j = 0; j < n; j++) {
        		if(j==0 || i+j==(n/2) || i-j==(n/2)) {
        			System.out.print("* ");
        		}else {
        			System.out.print("  ");
        		}
        	}
        	System.out.print("  ");
        	System.out.print("  ");
        	System.out.print("  ");
        	
        	System.out.println();
        	
        }
        System.out.print("  ");
        System.out.println();
        
        for (int i = 0; i < n; i++) {
        	for (int j = 0; j < n; j++) {
        		if((j==(n/2) && i>=(n/2)) || (i==j && j<=(n/2)) || (i+j==(n-1) && i<=(n/2))) {
        			System.out.print("* ");
        		}else {
        			System.out.print("  ");
        		}
        	}
        	System.out.print("  ");
        	for (int j = 0; j < n; j++) {
        		if(i==0 || j==(n-1) || i==(n-1) || j==0) {
        			System.out.print("* ");
        		}else {
        			System.out.print("  ");
        		}
        	}
        	System.out.print("  ");
        	for (int j = 0; j < n; j++) {
        		if(j==0 || j==(n-1) || i==(n-1)) {
        			System.out.print("* ");
        		}else {
        			System.out.print("  ");
        		}
        	}
        	System.out.print("  ");
        	System.out.print("  ");
        	System.out.print("  ");
        	for (int j = 0; j < n; j++) {
        		if(i==0 || i==(n-1) || i==(n/2) || (j==0 && i<=(n/2)) || (j==(n-1) && i>=(n/2))) {
        			System.out.print("* ");
        		}else {
        			System.out.print("  ");
        		}
        	}
        	System.out.print("  ");
        	for (int j = 0; j < n; j++) {
        		if(i==0 || i==n-1 || j==(n/2)) {
        			System.out.print("* ");
        		}else {
        			System.out.print("  ");
        		}
        	}
        	System.out.print("  ");
        	for (int j = 0; j < n; j++) {
        		if((i==0 && j<=(n/2)) || j==0 || (i==(n/2) && j<=(n/2)) || (j==(n/2) && i<=(n/2)) || i-j==(n/2)) {
        			System.out.print("* ");
        		}else {
        			System.out.print("  ");
        		}
        	}
        	System.out.println();
        }

	}

}
