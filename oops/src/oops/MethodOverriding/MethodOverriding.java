package oops.MethodOverriding;

class Bank{ // Parent
	double rateofInterest() {
		return 0;
	}
}

// 1st Child class 
class SBI extends Bank{
	double rateofInterest() {
		return 10.2;
	}
}

// 2nd Child Class 
class ICICI extends Bank{
	double rateofInterest() {
		return 11.2;
	}
	
}

public class MethodOverriding {

	public static void main(String[] args) {

		SBI obj = new SBI();
		System.out.println(obj.getClass());
		Display(obj.rateofInterest());
		
		ICICI obj2= new ICICI();
		System.out.println(obj2.getClass());
		Display(obj2.rateofInterest());

	}
	static void Display(double a) {
		System.out.println("Rate of Interest = "  + a);

	}
	
}
