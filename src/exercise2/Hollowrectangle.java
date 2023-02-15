package exercise2;

import java.util.Scanner;

public class Hollowrectangle {
	
	public static void hollowRectagle(int n, int m) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= m; j++) {
				if(i == 1 || i == n || j == 1 || j == m) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height of rectangle");
		int height = sc.nextInt();
		System.out.println("Enter the width of rectangle");
		int width = sc.nextInt();

		hollowRectagle(height, width);

	}

}
