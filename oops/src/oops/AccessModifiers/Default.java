package oops.AccessModifiers;

// Only within package & across multiple classes in same package

class _default{
	int a = 10;
	void m1() {
		
	}
}

public class Default {

	public static void main(String[] args) {
		_default obj = new _default();
		System.out.println(obj.a);
	}
}
