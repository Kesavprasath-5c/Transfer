package com.array;

public class Find_greaternumber {
	
public static void main (String[]args) {
	

	int[] number = {15,13,17,20};
	int i=0;
	int max =number[i];
	
	for( i=0;i < number.length;i++) {
	
	
		if(number[i]>max) {
			max=number[i];
			System.out.println("max value is="+max);
			}
		
	
	}
	
}	

}
