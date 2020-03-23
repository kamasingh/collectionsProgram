package com.camparableComparator.autudesk;
import java.util.*;

public class Student implements Comparable<Student> 

{

	int roll_no;
	String name;
	
	public Student(int roll_no, String name)
	{
	this.roll_no=roll_no;
	this.name=name;
	}
  
	@Override
	public int compareTo(Student st) {
		if(roll_no==st.roll_no)
		return 0;
		else if(roll_no>st.roll_no)
			return 1;
		else
			return -1;
	}
	public String toString() {
		return roll_no+" "+name;
	}
	public static void main(String[] args) {
		Student stu1 = new Student(10,"kamlesh");
		Student stu2 = new Student(1,"puja");
		Student stu3 = new Student(5,"kundan");
		Student stu4 = new Student(6,"kam");
		Student stu5 = new Student(19,"k");
		
		ArrayList al = new ArrayList();
		al.add(stu1);al.add(stu2);al.add(stu3);al.add(stu4);al.add(stu5);
		
	Collections.sort(al);
	System.out.println(al);
	}


}
