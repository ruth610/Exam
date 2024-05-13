package exam;

import java.util.Scanner;

public class LabExam1 {
	

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("enter the length of the Array: ");
		int n=input.nextInt();
		
		int[] array=new int[n];
		System.out.println("Enter the element of an array: ");
		
		for(int i=0;i<array.length;i++) {
			array[i] = input.nextInt();
			
		}
		
		System.out.print("Enter the number to be Searched: ");
		int element =input.nextInt();
		
		int count =0;
		for(int i=0;i<array.length;i++) {
			if(array[i]==element) {
				count++;
			}
		}
		if(count>0) {
			System.out.println("the searched Element " + element+ " is found " + count+ " times in the array");
		}
		else {
			System.out.println("the searched Element is not Found in the array:");
		}
		

	}

}
