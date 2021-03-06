package oops;

/*
 * In Static Methods:
 			Static Objects (var & Methods) can be directly called without creating object in Static Methods
 			Non-static methods need to be called using objects
 			
 	In Static Methods: 
 	You can call all (S & NS) directly w/o using objects
*/


public class Static {
	
	static int a=10;  // Static variable
	
	static void method1() {
		System.out.println("Static Method");
	}
	
	void method2() {
		System.out.println("Non-Static Method");
		
	}

	void method3() {
		method1();
		method2();
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		
		// Static Objects
		System.out.println("Static Objects");
		a=20;
		System.out.println(a);
		
		method1();
		
		//Non-static Objects
		System.out.println("\nNon-static");
		Static object = new Static();
		object.method2();
		
		System.out.println("\nCalling in non static methods");
		object.method3();
	}
}
