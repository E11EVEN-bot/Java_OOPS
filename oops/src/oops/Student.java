package oops;

public class Student {

	int sid;
	String sname;
	char grade;
	
	Student(int a, String b, char c){
		sid = a; 	sname=b;	grade=c;
	}
	
	void getValues(int a, String b, char c) {
		sid = a; 	sname=b;	grade=c;
	}
	
	void display() {
		System.out.print(sid  + " " + sname + " " + grade);
		System.out.println();
	}
	
}
