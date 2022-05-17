package oops.Inheritance;

interface A{
	int x =100;
	void method();
}
interface B{
	int y = 200;
	void method2();
}

public class MultipleInheritance implements A,B {
	
	public void method() {
		System.out.println(x);
	}
		public void method2() {
			System.out.println(y);
	}
	
		public static void main(String[] args) {
			MultipleInheritance obj = new MultipleInheritance();
			obj.method();
			obj.method2();
		}
}
