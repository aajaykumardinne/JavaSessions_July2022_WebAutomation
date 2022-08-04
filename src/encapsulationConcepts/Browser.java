package encapsulationConcepts;

public class Browser {

	public void launchBrowser() {
		System.out.println("launch the browser");
		checkBrowserVersion();
		checkOsCompatible();
		checkEnoughRAMSpace();
		browserOsUpgrade();
		System.out.println("browser launched successfully");
	}
	
	private void  checkBrowserVersion() {
		System.out.println("check the browser version");
	}
	
	private void  checkOsCompatible() {
		System.out.println("check the os compatible");
	}
	
	private void  checkEnoughRAMSpace() {
		System.out.println("check the enough RAM space");
	}
	
	private void browserOsUpgrade() {
		System.out.println("check the browser OS upgrade");
	}
	
	
	}
	

