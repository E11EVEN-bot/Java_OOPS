package oops.AccessModifiers;

class A{
	int a = 10;
	private int b =1;
}


public class Private {

	public static void main(String[] args) {
		A obj = new A();
		System.out.println(obj.a);
//		System.out.println(obj.b); 	// Error :x The field A.b is not visible

	}

}
