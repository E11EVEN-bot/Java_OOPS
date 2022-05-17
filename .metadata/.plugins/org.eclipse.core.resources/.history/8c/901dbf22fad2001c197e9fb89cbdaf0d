package oops;

public class CallByReference {
	int x;
	
	void addition(CallByReference a) {
		x=a.x+5;
		System.out.println(x);
	}

	public static void main(String[] args) {
		
		CallByReference obj = new CallByReference();
		
		obj.x=10;
		
		obj.addition(obj);  // Parameter as object :
		
	}
}
