package exercise4;

import java.util.Scanner;

public class DecimalRoman {
	
	//covert decimal to Roman
	 public static String decimal2Roman(int number) {
	        if (number < 1 || number > 100) {
	            throw new IllegalArgumentException("Number out of range: " + number);
	        }
	        StringBuilder roman = new StringBuilder();
	        int[] values = { 100, 90, 50, 40, 10, 9, 5, 4, 1 };
	        String[] symbols = { "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
	        for (int i = 0; i < values.length; i++) {
	            while (number >= values[i]) {
	                roman.append(symbols[i]);
	                number -= values[i];
	            }
	        }
	        return roman.toString();
	 }
	 
	
	//convert Roman to decimal 
	public static int roman2Decimal(String romanNumber) {
	    if (!isRomanNumberValid(romanNumber)) {
	        throw new IllegalArgumentException("Input is not a valid Roman numeral");
	    }
	    int result = 0;
	    String romanNumeral = romanNumber.toUpperCase();
	    for (int i = 0; i < romanNumeral.length(); i++) {
	        char ch = romanNumeral.charAt(i);
	        if (ch == 'I') {
	            if (i + 1 < romanNumeral.length() && romanNumeral.charAt(i + 1) == 'V') {
	                result += 4;
	                i++;
	            } else if (i + 1 < romanNumeral.length() && romanNumeral.charAt(i + 1) == 'X') {
	                result += 9;
	                i++;
	            } else {
	                result += 1;
	            }
	        } else if (ch == 'V') {
	            result += 5;
	        } else if (ch == 'X') {
	            if (i + 1 < romanNumeral.length() && romanNumeral.charAt(i + 1) == 'L') {
	                result += 40;
	                i++;
	            } else if (i + 1 < romanNumeral.length() && romanNumeral.charAt(i + 1) == 'C') {
	                result += 90;
	                i++;
	            } else {
	                result += 10;
	            }
	        } else if (ch == 'L') {
	            result += 50;
	        } else if (ch == 'C') {
	            result += 100;
	        }
	    }
	    return result;
	}

	 //Checking valid roman or not
	 public static boolean isRomanNumberValid(String romanNumber) {
        String pattern = "^(M{0,3})(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$";
        return romanNumber.matches(pattern);
	 }
	   
	 //checking valid decimal or not
	 public static boolean isDecimalNumberValid(int decimalNumber) {
		 return decimalNumber >= 1 && decimalNumber <= 100;
	 }

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Select conversion:");
        System.out.println("D2R: Decimal to Roman");
        System.out.println("R2D: Roman to Decimal");
        String input = sc.nextLine().toUpperCase();
        
        switch(input) {
        	case "D2R" :
        		System.out.println("Enter the decimal number");
        		int num = sc.nextInt();
        		String romanNum = decimal2Roman(num);
        		System.out.println("The roman value of " + num + " is " + romanNum);
        		break;
        	case "R2D" :
        		System.out.println("Enter the roman number");
        		String rNum = sc.nextLine();
        		int convertedNum = roman2Decimal(rNum);
        		System.out.println("The decimal value of " + rNum + " is " + convertedNum);
        	default :
        		System.out.println("Please enter a valid response");
        }
        
        sc.close();
	}

}
