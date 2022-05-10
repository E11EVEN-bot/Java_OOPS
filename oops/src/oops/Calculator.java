package oops;

public class Calculator {
	int x=100, y=100;
	
//	No Parameters, No O/P
	/*void sum() {
		System.out.println(x+y);
	}
	*/
	
// 	No Parameters, Returns O/P
	/*
	 int sum() {
		return x+y;
	}
	*/
	
// Parameters, No O/P
	/*void sum(int a,int b) {
		System.out.println(a+b);
	}
	*/
	
// Parameters, O/P
	
	int sum(int a, int b) {
		return a+b;
	}
	
	public static void main(String args[]) {
		Calculator cal= new Calculator();
//		cal.sum(30,40);
//		System.out.println(cal.sum());
		System.out.println(cal.sum(10,20));
	}
}
