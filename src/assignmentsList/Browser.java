package assignmentsList;

import java.util.ArrayList;

public class Browser {

	// class vars
	private String browserName;
	private String vendorName;
	private double currentVersion;
	private ArrayList<String> pluginsList;
	
	public ArrayList<String> pluginsList() {

		ArrayList<String> pluginsList = new ArrayList<String>();
		pluginsList.add("Add blocker");
		pluginsList.add("Google Translate");
		pluginsList.add("Go Fullpage");

		return pluginsList;

	}

	// constructor -- to initialize the class vars
	public Browser(String browserName) {
		this.browserName = browserName;
	}

	public Browser(String browserName, double currentVersion) {
		this.browserName = browserName;
		this.currentVersion = currentVersion;
	}

	public Browser(String browserName, String vendorName, double currentVersion) {
		this.browserName = browserName;
		this.vendorName = vendorName;
		this.currentVersion = currentVersion;
	}

	public Browser(String browserName, String vendorName, double currentVersion, ArrayList<String> pluginsList) {
		this.browserName = browserName;
		this.vendorName = vendorName;
		this.currentVersion = currentVersion;
		this.pluginsList = pluginsList;
	}

	// getter and setter methods
	// getter method -> to get the values
	// setter method -> to initialize the class vars and  to set the values
	public void setbrowserName(String browserName) {
		this.browserName = browserName;
	}

	public String getbrowserName() {
		return browserName;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public double getCurrentVersion() {
		return currentVersion;
	}

	public void setCurrentVersion(double currentVersion) {
		this.currentVersion = currentVersion;
	}

	public void setPluginsList(ArrayList<String> pluginsList) {
		this.pluginsList = pluginsList;
	}
	
	public ArrayList<String> getPluginsList() {
		return pluginsList;
	}

}
