package oops;

class Animal{
	String color = "White";
	
	void eating() {
		System.out.println("Eating");
	}
}

class Dog extends Animal{
	String color = "Red";
	
	void eating() {
		super.eating();
		System.out.println("Eating.....");
		
	}
	
	void display() {
		System.out.println(color);
		System.out.println(super.color);
		
	}
}


public class SuperKeyword {
	public static void main(String[] args) {
		 
		Dog d = new Dog();
		d.display();
		d.eating();

	}
}
