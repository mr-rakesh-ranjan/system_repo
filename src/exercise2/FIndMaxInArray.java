package exercise2;

import java.util.Scanner;

public class FIndMaxInArray {
	
	public static int findMaxIntInArray(int[] intArray) { 
		int res = Integer.MIN_VALUE;
		for(int i = 0; i < intArray.length; i++    ) {
			if(res < intArray[i]) {
				res = intArray[i];
			}
		}
		return res;
		
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array 'only in integer' ");
		int size = sc.nextInt();
		int [] arr = new int[size];
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		int res = findMaxIntInArray(arr);
		System.out.println("The maximum elements in the array is "+res);

	}

}
