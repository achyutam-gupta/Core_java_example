package interface_exm;

public class interClass implements inter2,inter1 {

	@Override
	public void inter1() {
		System.out.println("This is method 1");
	}

	@Override
	public void inter2() {
		System.out.println("This is method 2");

	}
	
	public static void main(String[] args) {
		interClass ic = new interClass();
		ic.inter1();
		ic.inter2();
	}
}
