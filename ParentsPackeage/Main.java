package ParentsPackeage;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Parents pr= new Child();
        System.out.println("Enter the number");
		
		int n=sc.nextInt();
		if(n<=0 && n>10) {
			System.out.println("Invalid number");
		}
		else {
		    pr.number=n;
		}
		
		pr.method1();
		pr.method2();
		pr.method3();
		
		Child ch=(Child)pr;
		ch.method4();
		
	}

}
