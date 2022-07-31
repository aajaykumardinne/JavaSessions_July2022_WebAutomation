package loopsConcepts;

public class ForEachLoop {

	public static void main(String[] args) {
		
		int i[] = new int[4]; // 0-3
		// here i is the array name of type int and  length 4 
		
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		// 1. index based for loop
		for(int k=0; k<i.length ; k++) {
			System.out.println(i[k]);
		}
	
		System.out.println("-----");
		
		// 2. for each -> new way of writing the for loop
		// data type of the above array
		// e is the variable name which means element
		// i is array name
		// will not work for the decremental part
		// condition such as if , else if can be used
		// break statment can also be used
		// you can not print the elements in the reverse order
		
		for(int e : i) {
			System.out.println(e);
		}
		System.out.println("-----");
		
		double d1[] = new double[3]; //0-2
		d1[0] = 15.31;
		d1[2] = 25.65;
		d1[1] = 13.21;
		
		for(double e : d1) {
			System.out.println(e);
		}
		
		char c1[] = new char[3];
		c1[0] = 'a';
		c1[1] = 'b';
		c1[2] = '4';
		
		for(char e : c1) {
			System.out.println(e);
		}
		
		
	}

}
