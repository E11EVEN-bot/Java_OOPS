package oops;

public class ThisKeyword {
	
	int a, b;
	
	//Method
	void add(int a, int b) {
		
		this.a=a;
		this.b=b;
	}
	
	// Method
	void display() {
		System.out.println(a + "\n" + b);
		System.out.println("Result = " + (a+b));
	}
	
	
	//Constructor
	ThisKeyword(int a, int b){
		this.a=a;
		this.b=b;
		
	}
	
	public static void main(String[] args) {
		ThisKeyword th = new ThisKeyword(20,30);
//		th.add(10,10);
		th.display();
	}
	
}
