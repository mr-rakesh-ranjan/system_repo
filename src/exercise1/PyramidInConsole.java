package exercise1;

import java.util.Scanner;

public class PyramidInConsole {

	private static void printPyramid(int height) {
		for(int i = 1; i <= height; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height of pyramid");
		int height = sc.nextInt();
		printPyramid(height);
		sc.close();

	}

	

}
