package assignmentsList;

import java.util.ArrayList;

public class TestUniversity {

	public static void main(String[] args) {
		
		University test = new University("University of New Haven", "USA");
		
		ArrayList<String>	coursesNamesList = test.getCoursesList();
		System.out.println(coursesNamesList);
		
		//get method to get the values
		String uniName = test.getName();
		System.out.println(uniName);
		
        String uniDate = test.getEstablishedDate();
        System.out.println(uniDate);
        
        String uniCountry = test.getCountry();
        System.out.println(uniCountry);
    
        // to set the values or update the values
        test.setEstablishedDate("1920");
        
        String uniDate1 = test.getEstablishedDate();
        System.out.println(uniDate1);
        
        

	}

}
