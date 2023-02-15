package exercise1;

import java.util.Scanner;

public class CircleCircumference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		int radius  = sc.nextInt();
		
		double circumference = 2 * Math.PI * radius;
		
		System.out.println("The circumference of the circle whose radius  " + radius + " is " + circumference);
		

	}

}
