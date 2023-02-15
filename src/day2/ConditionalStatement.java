package day2;

public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte range;
		range = 100;
		System.out.println("the byte value us " + range);

		
		short temp;
		temp = -200;
		System.out.println(temp);
		
		int a = 120;
		if(a > 70 && a < 170) {
			System.out.println("value is greater than 70 by less tha 170");
			
		}
		if( a == 200) {
			System.out.println("Bingo");
		} else {
			System.out.println("value is smaller than 200");
		}
		
	}

}
