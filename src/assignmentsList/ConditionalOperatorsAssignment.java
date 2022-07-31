package assignmentsList;

public class ConditionalOperatorsAssignment {

	public static void main(String[] args) {
		
		
		// 1. greatest number from three different given numbers
		int num1 = 25;
		int num2 = 78;
		int num3 = 87;
		
		if(num1>num2 & num1>num3) {
			System.out.println("The greatest number is : " + num1);
		}
		if(num2>num3) {
			System.out.println("The greatest number is: " + num2);
		}
		else {
			System.out.println("The  greatest number is: " + num3);
		}
		
		// 2. test a number is positive or negative
		int num = -5;
	//	int num = -11;
		
		if(num > 0) {
			System.out.println( "It is a positive number");
		}
		else if(num<0){
			System.out.println( "It is a negative number");
		}

	}

}
