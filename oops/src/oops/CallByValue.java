package oops;

public class CallByValue {

	int x=5;
	
	void addition(int a) {
		x+=a;
	}
	
	public static void main(String[] args) {
		CallByValue obj = new CallByValue();
		obj.addition(10);
//		System.out.println(x);    // -> Will throw Error!
		System.out.println(obj.x);

	}

}
