package encapsulationConcepts;

public class RegistraionPageTest {

	public static void main(String[] args) {
	
		//reg page
		RegistrationPage regp = new RegistrationPage("aajay", "kumar@orkut.com");

		// go to the profile page
		System.out.println(regp.getFirstName() + " " + regp.getEmail());
		
		System.out.println(regp.getLastName() + " " + regp.getPassword() + " " + regp.getPhoneNo());
		
		// profile page: update the info:
		regp.setEmail("kumarrocks@yahoo.com");
		regp.setFirstName("kumar peter");
		regp.setLastName("Jennifer");
		
		// go to the profile page
		System.out.println(regp.getFirstName() + " " + regp.getEmail());
		System.out.println(regp.getLastName() + " " + regp.getPassword() + " " + regp.getPhoneNo());
		
//		RegistrationPage regp1 = new RegistrationPage(null, null, null, null, null);
		
	}

}
