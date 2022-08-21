package exceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {

		System.out.println("A");

		try {
			int i = 9 / 0;
			System.out.println("hello exception");
		} catch (ArithmeticException e) {
			System.out.println("AE is coming");
			e.printStackTrace();
		}

		finally {
			System.out.println("im in finally block");
		}

		// Use cases of finally block

		// user1 : aajay
		// create a database connection: un/pwd - PASS
		// hit a sql - pass
//		try {
//			//get the results - fail - Exception
//		}
//		catch() {
//			
//		}

//		finally {
//			//close the database connection
//		}

		// store the results
		// print the results

		// user2 : ankit
		// create a database connection: un/pwd - PASS
		// hit a sql - pass
//				try {
//					//get the results - fail - Exception
//				}
//				catch() {
//					
//				}

//				finally {
//					//close the database connection
//				}

		// store the results
		// print the results

		// user3 : fatima
		// create a database connection: un/pwd - PASS
		// hit a sql - pass
//						try {
//							//get the results - fail - Exception
//						}
//						catch() {
//							
//						}

//						finally {
//							//close the database connection
//						}

		// store the results
		// print the results

	}

}
