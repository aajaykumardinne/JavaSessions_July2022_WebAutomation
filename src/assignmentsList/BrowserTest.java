package assignmentsList;

import java.util.ArrayList;

public class BrowserTest {

	public static void main(String[] args) {
		
		Browser br = new Browser("Firefox");
		
		String brName = br.getbrowserName();
		System.out.println(brName);
		
		// setter method to update the value
		br.setbrowserName("Chrome");
		
		// getter method to get the value
		String brName1 = br.getbrowserName();
		System.out.println(brName1);
		
		ArrayList<String>	pluginNamesList	= br.pluginsList();
		System.out.println(pluginNamesList);
		
	}

}
