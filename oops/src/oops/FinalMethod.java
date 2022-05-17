package oops;

class one{
	 final void method(){
		System.out.println("One");
	}
}
	
class two extends one{
	// Cannot override the final method from one
	/*void method(){
		System.out.println("One");
	}
	*/
}
public class FinalMethod {
	
}
