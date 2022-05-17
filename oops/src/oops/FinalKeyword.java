package oops;

public class FinalKeyword {
	final int speed=100;
	
	

	public static void main(String[] args) {
		FinalKeyword object = new FinalKeyword();
		//object.speed =10;//final field FinalKeyword.speed cannot be assigned
		System.out.println(object.speed);
		
	}

}
