package exercise3;

import java.util.*;

public class RotateMatrix {
	
	public static void rotate90(double[][] matrix) {
		int n = matrix.length;
		for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
            	double temp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - j][i];
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
                matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
                matrix[j][n - 1 - i] = temp;
            }
        }
    } 

	public static void rotate180(double[][] matrix) { 
		System.out.println("The matrix is rotated by 180 degree");
		int size = matrix.length;
		
		for (int i = size - 1; i >= 0; i--) {
            for (int j = size - 1; j >= 0; j--) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
		
	} 

	public static void rotate270(double[][] matrix) {
		int size = matrix.length;
		for (int x = 0; x < size / 2; x++) {
            for (int y = x; y < size - x - 1; y++) {
                double temp = matrix[x][y];
                matrix[x][y] = matrix[y][size - 1 - x];
                matrix[y][size - 1 - x] = matrix[size - 1 - x][size - 1 - y];
                matrix[size - 1 - x][size - 1 - y] = matrix[size - 1 - y][x];
                matrix[size - 1 - y][x] = temp;
            }
        }
	} 
	
	public static void display(double [][] matrix) {
		int size = matrix.length;
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of matrix");
		int size = sc.nextInt();
		//creating matrix
		double [][] matrix = new double[size][size];
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				matrix[i][j] = i + j / 10.0;
			}
		}
		
		System.out.println("The original matrix is : ");
		display(matrix);
		
		System.out.println("- Press 1 to rotate matrix to 90 degrees \r\n"
				+ "- Press 2 to rotate matrix to 180 degrees \r\n"
				+ "- Press 3 to rotate matrix to 270 degrees");
		
		int ch = sc.nextInt();
		switch(ch) {
			case 1:
				rotate90(matrix);
				System.out.println("The matrix is rotate by 90 degree : ");
				display(matrix);
				break;
			case 2:
				rotate180(matrix);
				break;
			case 3:
				rotate270(matrix);
				System.out.println("The matrix is rotate by 270 degree : ");
				display(matrix);
				break;
			default:
				System.out.println("Please enter the valid key");
		}
		sc.close();

	}
	

}
