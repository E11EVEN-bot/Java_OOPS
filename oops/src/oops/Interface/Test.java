package oops.Interface;

interface A{
	int a=10;		// Variables are by Default static & Final || Variables should be initialized
	void m1();		// Abstract methods are by default public 
}


public class Test implements A{

	public void m1(){
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		Test obj = new Test(); // Or A obj = new Test();
		obj.m1();
	}

}
