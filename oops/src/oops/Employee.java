package oops;

public class Employee {

	//Class variables
	int e_id;
	String e_name;
	int dept_no;
	String job;
	
	//Class Methods
	void display() {
		System.out.println(e_id);
		System.out.println(e_name);
		System.out.println(dept_no);
		System.out.println(job);
	}		
		//Main Method
		public static void main(String args[]) {
			Employee emp1 = new Employee();
			
			emp1.e_id = 101;
			emp1.e_name = "Hamza";
			emp1.dept_no = 10;
			emp1.job = "Associate";
			
			emp1.display();
			
			System.out.println("********************2nd Class***************************");
			
			Employee emp2 = new Employee();
			emp2.e_id = 102;
			emp2.e_name = "Hamza2";
			emp2.dept_no = 20;
			emp2.job = "Engineer";
			
			emp2.display(); 
		}
		
	
}
