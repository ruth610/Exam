package exam;

import java.util.Arrays;

public class LabExam6 {
	public static void delete(int[] array,int index) {
		
		int[] newarr1 = new int[array.length-1];
		for(int i=0,j=0;i<array.length;i++) {
			if(i!=index) {
				newarr1[j]=array[i];
				j++;
			}
			
			
		}
		System.out.println(Arrays.toString(newarr1));
	}

	public static void main(String[] args) {
		int[] array={3, 7, 1, 9, 4};
		LabExam6.delete(array,1);

	}

}
