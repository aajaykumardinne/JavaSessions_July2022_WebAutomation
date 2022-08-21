package dataConversion;

import java.awt.datatransfer.SystemFlavorMap;
import java.util.Arrays;

public class DataConversion {

	public static void main(String[] args) {
		
		//1. String to int
		String x = "100";
		System.out.println(x+30);  //+ acts as concat operator
		
		//wrapper classes
		//int -> Integer
		int y = Integer.parseInt(x);
		System.out.println(y+30);
		
//		String z = "100A";
//		System.out.println(z+30);
//		int y1	= Integer.parseInt(z);  // NumberFormatException
//		System.out.println(y1+30);
		
		
		//2. String to double
		String t = "12.33";
		System.out.println(t+20);
		
		double d3 = Double.parseDouble(t);
		System.out.println(d3+20);
		
		// 3. int to String
		int pop = 1000;
		System.out.println(pop+50);
		
		//valueOf() converts int data type to String
		String g = String.valueOf(pop);
		System.out.println(g+50);
		
		// 4. double to String
		double avg = 15.78;
		String newAvg = String.valueOf(avg);
		System.out.println(newAvg+100);
		
		// 5. String to boolean
		String headless = "false";
		boolean flag = Boolean.parseBoolean(headless);
		
		if(flag) {
			System.out.println("run in headless mode");
		}
		else {
			System.out.println("run in the normal mode");
		}
		
		// 6. Boolean to string
		boolean test = true;
		String p = String.valueOf(test);
		System.out.println(p+20);
		
		//split:
		String top = "Java_Python_Ruby_Javascript";
		String[] arr = top.split("_");
	//	System.out.println(newtop[0]);
		for(String e : arr) {
			System.out.println(e);
		}
		
		//return type of split method is String array 
		
		String foo = "xXtestingXxXseleniumxXXautomationXxXjava";
		String[] f = foo.split("xX");
		
		//length() to calculate the length of the string
		//or no of characters present in the string
		System.out.println(f[1].length());
		
		System.out.println(f[3]);
		
		System.out.println(f[2]);
		
		String lol = "HelloJavaAutomationJavaTesting";
		String[] l = lol.split("Java");
		//toString() to prints all the values of the array literals of primitive
		//data types and Object class
		System.out.println(Arrays.toString(l));
		
		String empData = "anil;excited;7823123913;aniltemper@gmail.com;";
		String[] data = empData.split(";");
		for(String e : data) {
			System.out.println(e);
		}
		
		String lg = "Hello  selenium    java    testng";
		String lt[] = lg.split("\\s+");
		//print all the elements of the String array
		System.out.println(Arrays.toString(lt));
		

	}

}
