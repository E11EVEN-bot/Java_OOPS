package oops;

public class Constructor {
	
	int x,y;
	
	Constructor(){				// Default Constructor
		x = 100; y=200;
		System.out.println(x+y);
	}
	
	Constructor(int a, int b){  // Parameterized Constructor
		System.out.println(a+b);
	}
	
	Constructor(String a, int b){   // Different Parameter
		System.out.println(a + " " +b);
	}
	
	Constructor(int a, int b, int c){
		System.out.println(a+b+c);
	}
	

	public static void main(String[] args) {
		
		Constructor c1 = new Constructor();
		Constructor c2 = new Constructor(10,20);
		Constructor c3 = new Constructor("Hamza", 7);
		Constructor c4 = new Constructor(10,10,10);
		
	
		

	}

}
