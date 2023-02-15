package exercise2;

import java.util.Scanner;

public class PyramidInConsole {
	
	static void Pyramid(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 2; i <= 4; i++) {
			for(int j = n; j>= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the height of pyramid");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Pyramid(n);
	}

}
