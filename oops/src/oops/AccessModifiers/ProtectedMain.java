package oops.AccessModifiers;

// If you want to use it in another Package you can use it by using inheritance using extends

public class ProtectedMain { 

	public static void main(String[] args) {
		Protected obj = new Protected();
		System.out.println(obj.a+10);
		obj.m1();

	}

}
