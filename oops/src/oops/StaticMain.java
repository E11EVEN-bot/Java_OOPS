package oops;

public class StaticMain {

	public static void main(String[] args) {
		
		System.out.println("Static Objects");
		Static.a=20;
		System.out.println(Static.a);
		
		Static.method1();
		
		//Non-static Objects
		System.out.println("\nNon-static");
		Static object = new Static();
		object.method2();
		
		System.out.println("\nCalling in non static methods");
		object.method3();
	}
	
}
