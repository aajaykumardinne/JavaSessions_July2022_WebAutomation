package assignmentsList;

import java.util.ArrayList;

public class University {

	// class vars
	private String name;
	private String country;
	private String establishedDate;

	public ArrayList<String> getCoursesList() {
		
		ArrayList<String> coursesList = new ArrayList<String>();
		coursesList.add("Java -- Programming Language binding");
		coursesList.add("Selenium -- Automation Framework");
		coursesList.add("TestNG Framework -- To write the unit test cases");
		coursesList.add("Page Object Model -- Design Patterns for the Framework");
		coursesList.add("Devops -- GIT,Jenkins,Docker,Maven,AWS");
		
		return coursesList;
	}

	// cons
	public University(String name) {
		this.name = name;
	}

	public University(String name, String country) {
		this.name = name;
		this.country = country;
	}

	public University(String name, String country, String establishedDate) {
		this.name = name;
		this.country = country;
		this.establishedDate = establishedDate;
	}

	// getter and setter methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEstablishedDate() {
		return establishedDate;
	}

	public void setEstablishedDate(String establishedDate) {
		this.establishedDate = establishedDate;
	}

}
