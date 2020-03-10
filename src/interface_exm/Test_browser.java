package interface_exm;

public class Test_browser {

	BrowserI browser = null; // First create the interface object

	public void create(String bname) {

		if (bname.equals("Chrome")) {
			browser = new Chrome(); // Call and create the subclass object
		} else {
			browser = new FireFox(); // Same as above
		}
		browser.open_browser(); // Always call the methods of super parent class
								// .
		browser.max_browser();
		browser.min_browser();
		browser.close_browser();
	}

	public static void main(String[] args) {
		Test_browser tb = new Test_browser();
		tb.create("FireFox");

	}

}
