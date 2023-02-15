package exercise3;

import java.util.Random;
import java.util.Scanner;

public class ExtendArray {
	
	public static int[] generateRandomArray(int amountOfElements) { 
		int [] generatedArray = new int[amountOfElements];
		Random random = new Random();
		for(int i = 0;i < amountOfElements; i++) {
			generatedArray[i] = random.nextInt(0, 100);
		}
        return generatedArray;
	}
	
	 
	public static int[] extendArray(int[] oldArray) {
		int oldLength = oldArray.length;
		int [] extendedArray = new int[2 * oldLength];
		for(int i = 0; i < 2 * oldLength; i++ ) {
			if(i < oldLength) {
				extendedArray[i] = oldArray[i];				
			} else {
				Random random = new Random();
				extendedArray[i] = random.nextInt(0, 100);
			}
		}
		return extendedArray;
	} 
	
	public static void display(int [] arr) {
		int size = arr.length;
		for(int i = 0; i< size; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array : (only integer type)");
		int length = sc.nextInt();
		int [] arr = generateRandomArray(length);
		System.out.println("The array with length " + length + " : ");
		display(arr);
		System.out.println();
		int [] extendedArray = extendArray(arr);
		System.out.println("The extend array with length " + 2 * length + " : ");
		display(extendedArray);
		sc.close();

	}

}
