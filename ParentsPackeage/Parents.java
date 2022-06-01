package ParentsPackeage;

public abstract class Parents {
	
	 int number;
		abstract void method1();
    final void method2() {
    	System.out.println("Method 2(Parents class): This method can not be overridde");
    }
    void method3() {
    	
    	System.out.println("Method 3(Parents class): This method may or maynot be overridde");
    }
}
