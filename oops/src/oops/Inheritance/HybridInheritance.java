package oops.Inheritance;

interface A1{

	int a= 10;
	void m1();
}
interface B1 extends A1{
	
	int b= 20;
	void m2();
	
}
interface C1 extends A1{
	
	int c= 30;
	void m3();
	
}



public class HybridInheritance implements B1,C1 {

	public void m1() {
		System.out.println(a);
	}
	public void m2() {
		System.out.println(b);
	}
	public void m3() {
		System.out.println(c);
	}
	
	
	public static void main(String[] args) {

		HybridInheritance obj = new HybridInheritance();
			obj.m1();
			obj.m2();
			obj.m3();
	}

}
