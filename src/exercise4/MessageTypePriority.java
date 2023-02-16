package exercise4;

import java.util.Scanner;

// creating enum
enum Priority{
	HIGH, MEDIUM, LOW
}


public class MessageTypePriority {
	
	enum MessageType {
		A,B,C,D;
		
		public Priority getPriority() {
			switch(this) {
				case A : 
					return Priority.HIGH;
				case B : 
					return Priority.MEDIUM;
				case C :
					return Priority.LOW;
				case D :
					return Priority.LOW;
				default :
					throw new AssertionError("Unknown message type" + this);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a message (A, B, C or D) :");
		String message = sc.nextLine().toUpperCase();
		
		MessageType msgType = MessageType.valueOf(message);
		System.out.println(msgType.getPriority());
		
		sc.close();
	}

}
