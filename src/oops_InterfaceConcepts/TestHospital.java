package oops_InterfaceConcepts;

public class TestHospital {

	public static void main(String[] args) {
		
		FortisHospital fh = new FortisHospital();
		
		fh.emergencyServices();
		fh.neuroServices();
		
		fh.oncologyServices();
		fh.ENTServices();
		
		fh.medicalresearch();   //inherited methods
		fh.publishMedicalNews(); //inherited methods
		
		fh.freeHealthCare();   //overridden methods
		fh.dentalServices();   //overridden methods
		
		fh.xrayServices();
		fh.xrayServices("Hari", "xray1290-rt");
		
		
		// static vars and methods can be accessed by 
		// parent interface and child class
		
		//static vars
		System.out.println(USMedical.min_fee);
	//	USMedical.min_fee = 100;
		System.out.println(FortisHospital.min_fee);
		
		//static methods
		USMedical.training();
		FortisHospital.training();
		
		
		// can not create the object of the interface
//		UKMedical uk = new UKMedical();
		
		//1.top/up casting
		//child class object can be referred by parent interface ref name
		
		USMedical us = new FortisHospital();
		
		//USA
		us.orthoServices();
		us.emergencyServices(); //common methods
		us.pediaServices();
		us.physioServices();
		
		//2. bottom/down casting
		// will throw an error at the compile time
//		FortisHospital fh1 = new USMedical();

	}

}
