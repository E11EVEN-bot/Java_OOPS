package oops;

public class Calculation {

	int a,b,c;
	
	Calculation(int x, int y,int z){			// Constructor to assign values
		a=x;
		b=y;
		c=z;
	}
	
	void sum() {
		System.out.println(a+b+c);
	}
	
	
	public static void main(String[] args) {
		Calculation cal = new Calculation(10,10,10);
		cal.sum();
		
		
	}

}
