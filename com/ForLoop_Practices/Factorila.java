package com.ForLoop_Practices;

import java.util.Scanner;

public class Factorila {
	
	static int fact= 1;
	
public static void main (String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number");
	
	int num =sc.nextInt();
	
	 for(int i=1;i<=num;i++) {
		 
		  fact = i*fact;
		  System.out.println(fact); 
	 }
	 System.out.println(fact);
}
}
