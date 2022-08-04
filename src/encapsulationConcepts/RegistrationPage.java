package encapsulationConcepts;

public class RegistrationPage {
	
	
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private String phoneNo;
	
	// constructor - used to create the object once for the first time
	
	public RegistrationPage(String firstName, String email) {
		this.firstName = firstName;
		this.email = email;
	}

	public RegistrationPage(String firstName, String password, String email) {
		this.firstName = firstName;
		this.password = password;
		this.email = email;
	}

	public RegistrationPage(String firstName, String lastName, String password, String email, String phoneNo) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
		this.phoneNo = phoneNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	
	
	
	

}
