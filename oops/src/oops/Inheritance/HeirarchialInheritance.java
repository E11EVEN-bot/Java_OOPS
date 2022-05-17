package oops.Inheritance;

class Parent{	//1 Parent - 2 child
	int a=10;
	void display(int x, int y) {
		System.out.println(x + " " + y);
	}
}

class Child1 extends Parent{
	int x=10;
}

class Child2 extends Parent{
	int y=20;
}

public class HeirarchialInheritance {

	public static void main(String[] args) {
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();

		c1.display(c1.a, c1.x);
		c2.display(c2.a, c2.y);
		
	}

}
