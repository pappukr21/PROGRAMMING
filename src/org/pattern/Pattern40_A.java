package org.pattern;

import java.util.Scanner;

public class Pattern40_A{
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of lines");
        int n=sc.nextInt();
        int sp=0,ele=2;
        for(int i=1;i<=n;i++) {
        	for(int j=1;j<=n-i;j++) {
                System.out.print("  ");
        	}
        	for(int j=1;j<=2;j++) {
        		System.out.print("* ");
        		if(i<=n)
        			System.out.print("  ");
        		sp++;
        		
        	}
        	
        	    System.out.println();
        }
       
}
}
