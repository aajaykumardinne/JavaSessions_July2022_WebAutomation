package oops_InterfaceConcepts;

public class FortisHospital extends Medical implements USMedical, UKMedical, IndianMedical, CanadaMedical {

	// USA
	@Override
	public void pediaServices() {
		System.out.println("FortisHospital -- pediaServices");
	}

	@Override
	public void physioServices() {
		System.out.println("FortisHospital -- physioServices");
	}

	@Override
	public void orthoServices() {
		System.out.println("FortisHospital -- orthoServices");
	}

	// UK
	@Override
	public void ENTServices() {
		System.out.println("FortisHospital -- ENTServices");

	}

	@Override
	public void cardioServices() {
		System.out.println("FortisHospital --cardioServices");
	}

	// India
	@Override
	public void oncologyServices() {
		System.out.println("FortisHospital -- oncologyServices");

	}

	@Override
	public void neuroServices() {
		System.out.println("FortisHospital -- neuroServices ");

	}

	// individual methods
	public void pathologyServices() {
		System.out.println("FortisHospital -- pathologyServices");
	}

	public void OPTDepartmentServices() {
		System.out.println("FortisHospital -- OPTDepartmentServices");
	}

	// common-interface method
	@Override
	public void emergencyServices() {
		System.out.println("FortisHospital -- emergencyServices");
	}

	// WHO
	@Override
	public void covid19News() {
		System.out.println("FortisHospital -- covid19News");
	}

	@Override
	public void covid19Vaccine() {
		System.out.println("FortisHospital -- covid19Vaccine");
	}

	// Canada
	@Override
	public void freeHealthCare() {
		System.out.println("FortisHospital -- freeHealthCare");

	}

	//Example of MethodOverriding + Method Overloading
	@Override
	public void dentalServices() {
		System.out.println("FortisHospital --dentalServices");
	}

	@Override
	public void xrayServices() {
		System.out.println("FortisHospital --xrayServices");
	}

	@Override
	public void xrayServices(String xrayTechnician, String xrayMachine) {
		System.out.println("FortisHospital --xrayServices " + xrayTechnician + " : " + xrayMachine);
		
	}
	
	// Method hiding
	public static void training() {
		System.out.println("Fortis hospital -- medical training");
	}
	
	// can we override default method from the interface
	@Override
	public void donation() {
		System.out.println("Fortis hospital -- donation");
	}

}
