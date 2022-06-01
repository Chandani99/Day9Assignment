package ParentsPackeage;

public final class Child extends Parents {
	
	void method4() {
		   System.out.println("Method 4 child class");	
	}

	@Override
	void method1() {
		
		System.out.println("Overriden method1: value of num= "+super.number);
		
	}
}
