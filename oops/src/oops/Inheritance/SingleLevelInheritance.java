package oops.Inheritance;

class One{
	int a=10;
	void display(int x) {
		System.out.println(x);
	}
}
class Two extends One{
	int b=20;
	int sum(int a,int b) {
		return a+b;
	}
}



public class SingleLevelInheritance {

	public static void main(String[] args) {
		One obj_1 = new One();
		obj_1.display(1);
		
		Two obj_2 = new Two();
		obj_2.display(2);
		int result = obj_2.sum(10, 20);
		obj_1.display(result);
		
	}

}
