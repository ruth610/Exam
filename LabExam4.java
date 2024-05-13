package exam;

import java.util.Arrays;
import java.util.Scanner;
//LabExam4

public class LabExam4 {
	static char[] ascii= {'c','a','d','g','r'};
	
	
	public static void bubbleSorting(char[] ascii) {
		
		char temp;
		
		for(int i=0;i<ascii.length;i++) {
			
			for(int j=0;j<ascii.length-1-i;j++) {
				
				if(ascii[j]>(ascii[j+1])) {
					temp = ascii[j+1];
					ascii[j+1] = ascii[j];
					ascii[j] = temp;
					
				}
			}
		}
		System.out.print(ascii);
	}
	
		

	public static void main(String[] args) {
		LabExam4.bubbleSorting(ascii);
		
	    
		
		
		
		
		
		
		
		
		
		
		

	}

}
