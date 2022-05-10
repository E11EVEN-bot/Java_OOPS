package oops;

public class AccessClassFromDifferentfile {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		
		emp1.e_id=10;
		emp1.e_name= "Hamza";
		emp1.dept_no=10;
		emp1.job="associate";
		
		emp1.display();

	}

}
