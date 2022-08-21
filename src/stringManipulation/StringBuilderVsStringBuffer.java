package stringManipulation;

public class StringBuilderVsStringBuffer {

	public static void main(String[] args) {
		
		//StringBuilder class
		//1.not thread safe
		//2.Not synchronized
		//3.execution time is faster as the different threads
		//will start working on the same object or value.
		//4.mutable which means we can modify the value.
		
		StringBuilder sb = new StringBuilder("API");
		sb.append("automation");
		
		System.out.println(sb);	
		System.out.println(sb.reverse());
		
		
		//StringBuffer class
		//1.thread safe
		//2.synchronization is achieved
		//3.execution time is slow as the threads will execute in 
		// sequential manner
		//4.mutable
		StringBuffer sbf = new StringBuffer("WEB");
		sbf.append("testing");
		
		System.out.println(sbf);
		System.out.println(sbf.reverse());
		
		//String class
		String str = "manual";
		str.concat("testing"); //manualtesting
		System.out.println(str);
		
		
	}

}
