package exercise1;

import java.util.Scanner;

public class AreaOfTriangle {
	
	private static boolean isTriangle(int a, int b, int c) {
		boolean res = false;
		if(a + b >= c && a + c >= b && b + c >= a) {
			res = true;
		} 
		return res;
	}
	
	private static double calculateArea(int a, int b, int c) {
		double sum = a + b + c;
		double p = sum /2;
		double area = Math.sqrt(p * (p - a) * (p -b) * (p - c));
		return area;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of the side A of triangle ");
		int a = sc.nextInt();
		System.out.println("Enter length of the side B of triangle ");
		int b = sc.nextInt();
		System.out.println("Enter length of the side C of triangle ");
		int c = sc.nextInt();
		
		if(isTriangle(a,b,c)) {
			double area = calculateArea(a,b,c);
			System.out.println("The area of triangle whose side are : " + a + ", " + b +  " and " + c + " is " + area);
		} else {
			System.out.println("NaN");
		}

	}

	

	

}
