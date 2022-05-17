package oops.Inheritance;

class one1{
	int a=10;
	void Display(int x) {
		System.out.println(x);
	}
}
class two2 extends one1{
	int b=20;
	int multiply(int a, int b) {
		return a*b;
	}
}
class three3 extends two2{
	int c=30;
	int sum(int a, int b, int c) {
		return a+b+c;
	}
}


public class MultiLevel {

	public static void main(String[] args) {
		one1 obj1 = new one1();
		two2 obj2 = new two2();
		three3 obj3 = new three3();
		
		int result = obj3.sum(obj1.a,obj2.b,obj3.c);
		obj3.Display(result);
		obj1.Display(obj3.multiply(result, result));

	}

}
