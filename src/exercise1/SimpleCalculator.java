package exercise1;

public class SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if (args.length != 2) {
		      System.out.println("Error: Program requires two arguments");
		      return;
		    }

		    double firstNumber;
		    double secondNumber;
		    try {
		      firstNumber = Double.parseDouble(args[0]);
		      secondNumber = Double.parseDouble(args[1]);
		    } catch (NumberFormatException e) {
		      System.out.println("Error: Arguments must be numbers");
		      return;
		    }

		    double result = firstNumber + secondNumber;
		    System.out.println("The first number is " + firstNumber + " and the second number is " + secondNumber);
		    if (result == (int) result) {
		      System.out.println((int) result);
		    } else {
		      System.out.println(result);
		    }

	}

}
