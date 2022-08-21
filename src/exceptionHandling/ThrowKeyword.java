package exceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {

		String data = null;

		if (data == null) {

			// throw keyword is used to customize the exception

			try {
				throw new Exception("NODATAFOUNDEXCEPTION");
			} catch (Exception e) {
				System.out.println("data not found error");
				e.printStackTrace();
			}

		}
		System.out.println("bye");

	}

}
