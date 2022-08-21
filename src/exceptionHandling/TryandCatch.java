package exceptionHandling;

import java.io.File;
import java.io.FileInputStream;

public class TryandCatch {

	String name;
	
	public static void main(String[] args) {
		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		//checked exception :
		//compiler will throw and exception at the compile time
	//	Thread.sleep(5000);
		
		
//		File file = new File("test.jpeg");
//		FileInputStream fip = new FileInputStream(file);
		
		try {
			int j = 10/0;
			System.out.println("hello");
			System.out.println("hello");
//			
//			TryandCatch obj = new TryandCatch();
//			obj = null;
//			obj.name = "aajay"; //NullPointerException
			
		} catch (Throwable e) {
			System.out.println("Arithmetic Exception is coming");
			e.printStackTrace();
		}
//		catch (NullPointerException e) {
//			System.out.println("Null Pointer Exception is coming");
//			e.printStackTrace();
//		}
		
		
		System.out.println("bye");
		System.out.println("bye");
		System.out.println("bye");
		System.out.println("bye");
		
		
		try {
			int b = 7/0;
			
		}catch(Exception e) {
			System.out.println("Arithmetic exception is coming");
		}

	}

}
