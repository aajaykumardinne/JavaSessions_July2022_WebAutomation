package builderPatternsConcepts;

public class ShoppingTest {

	public static void main(String[] args) {
	
		Ecomm user1 = new Ecomm();
		
		//builder pattern:
		//According to builder pattern Every method should return this keyword
		//adv: code looks neat and clean
		//with the same object reference name
		user1.doLogin("aajay@outlook.com", "seleniumautomation")
				.doSearch("macbook air")
				  .selectProduct("M1 16gb macbook air")
				   .addToCart("M1 16gb macbook air")
				    .makePayment("aajayhyd@axl")
				      .generateOrder()
				        .logout();
		
		//
		user1.doLogin("john@gmail.com", "mindset")
		       .addToCart("iMac")
		         .makePayment("723273@axl")
		           .generateOrder()
		             .logout();
		
		//
		user1.doLogin("kumar@yahoo.com", "soul")
		       .logout();
		
		
		//
		user1.doLogin("kumar@yahoo.com", "soul");
		
		//
		user1.doLogin()
		       .doSearch("iPhone")
		       	.logout();
		
		
		
		
					
	}

}
