package oops.Interface;

interface X{
	int a=10;
	int b=20;
	void sum();
}

public class Assignment1 implements X{
	public void sum() {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		X obj = new Assignment1();
		obj.sum();
	}

}
