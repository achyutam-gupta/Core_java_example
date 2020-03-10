package interface_exm;

public class Chrome implements BrowserI {

	@Override
	public void open_browser() {
		// TODO Auto-generated method stub
System.out.println(" Open the Chrome Browser ");	
}

	@Override
	public void max_browser() {
		// TODO Auto-generated method stub
		System.out.println(" Maximize the Chrome Browser ");	

	}

	@Override
	public void min_browser() {
		// TODO Auto-generated method stub
		System.out.println(" Minimize the Chrome Browser ");	

	}

	@Override
	public void close_browser() {
		// TODO Auto-generated method stub
		System.out.println(" Close the Chrome Browser ");	

	}
	
}
