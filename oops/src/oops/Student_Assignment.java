package oops;

public class  Student_Assignment{
	int sid,sub1, sub2, sub3;
	String Sname;
	
	void getStuData(int a, String b) {
		sid = a;
		Sname = b;
		System.out.println(sid + "  " + Sname);
	}
	
	void getStuMarks(int a, int b, int c) {
		sub1 = a;
		sub2 = b;
		sub3 = c;
}
	
	int totalMarks() {
		return sub1+sub2+sub3;
	}

	public static void main(String[] args) {
		Student_Assignment s1 = new Student_Assignment();
		Student_Assignment s2 = new Student_Assignment();
		
		s1.getStuData(1, "Hamza");
		s2.getStuMarks(10, 10, 10);
		System.out.println(s2.totalMarks());
		
	}
}
