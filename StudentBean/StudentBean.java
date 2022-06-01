package StudentBean;

import java.util.Scanner;

public class StudentBean {
	private  int roll;
	private String  name;
	private int marks;
	private char grade;
	
	public StudentBean() {
		
	}
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
//	Methods ================================
	
	

	
    public void displayDetails() {
		Scanner sc=new Scanner(System.in);
		
		
		StudentBean st=new StudentBean();
		System.out.println("Enter roll number");
		int roll=sc.nextInt();
		st.setRoll(roll);
		
		System.out.println("Enter name");
		String name=sc.next();
		st.setName(name);
		
		System.out.println("Enter marks");
		int marks=sc.nextInt();
		st.setMarks(marks);
		
		char grd=st.calculateGrade(marks);
		
		st.setGrade(grd);

        System.out.println(st.toString());

		
	}
    
	@Override
	
	public String toString() {
		return "StudentBean [roll=" + roll + ", name=" + name + ", marks=" + marks + ", grade=" + grade + ", getRoll()="
				+ getRoll() + ", getName()=" + getName() + ", getMarks()=" + getMarks() + ", getGrade()=" + getGrade()
				+ "]";
	}
    
	private char calculateGrade(int marks) {
		if(marks>=500) {
			return 'A';	
		}
		else if(marks<500 && marks>=400) {
			return'B';
		}
		else {
			return 'C';
		}
	}	
}
