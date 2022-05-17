package oops.Interface;

interface One{
	int a=10;
	int b=20;
	void sum();
}
interface Two{
	int x=30;
	int y=40;
	void multiply();
}
public class Assignment2 implements One,Two{
	
	public void sum() {
		System.out.println(a+b);
	}
	public void multiply() {
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		
		Assignment2 obj = new Assignment2();
			obj.sum();
			obj.multiply();
	}

}
