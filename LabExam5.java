package exam;

import java.util.Arrays;
import java.util.Scanner;

public class LabExam5 {
	
	public static void mergeSort(int[] arr,int l , int r) {
		int mid=(l+r)/2;
		if(l<r) {
			mergeSort(arr,l,mid);
			mergeSort(arr,mid+1,r);
			merge(arr,l,r,mid);
			
		}
		System.out.println(Arrays.toString(arr));
			
			
	}
public static  void merge(int[] arr,int l,int r,int mid) {
		
		int nl=mid-0+1;
		int nr=r-mid;
		int[] lArr = new int[nl];
		int[]rArr = new int[nr];
		for(int x=0;x<nl;x++) {
			lArr[x] = arr[l+x];
		}
		for(int x=0;x<nr;x++) {
			rArr[x] = arr[x+mid+1];
		}
		
		int i=0;
		int j=0;
		int k=l;
		while(i<nl && j<nr) {
			if(lArr[i]<=rArr[j]) {
				arr[k] = lArr[i];
				i++;
			}
			else {
				arr[k] = rArr[j];
				j++;
				
				
			}
			k++;
			
		}
		while(i<nl) {
			arr[k] = lArr[i];
			i++;
			k++;
		}
		while(j<nr) {
			arr[k] = rArr[j];
			j++;
			k++;
		}
		
		
	}
	

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the length of the Array: ");
		int n=input.nextInt();
		
		int[] array=new int[n];
		System.out.println("Enter the element of an array: ");
		
		for(int i=0;i<array.length;i++) {
			array[i] = input.nextInt();
			
		}
		LabExam5.mergeSort(array,0 , n-1);
		
		
		
		
		
		

	}

}
