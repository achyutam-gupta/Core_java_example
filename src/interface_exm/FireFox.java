package interface_exm;

public class FireFox implements BrowserI {

	@Override
	public void open_browser() {
		System.out.println(" Open the FireFox Browser ");	
		
	}

	@Override
	public void max_browser() {
		System.out.println(" Maximise the FireFox Browser ");	
		
	}

	@Override
	public void min_browser() {
		System.out.println(" Minimize the FireFox Browser ");	
		
	}

	@Override
	public void close_browser() {
		System.out.println(" Close the FireFox Browser ");	
		
	}

}
