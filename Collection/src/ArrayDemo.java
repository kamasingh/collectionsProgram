import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

class Student{
	
}
class Teacher{

	
}
public class ArrayDemo {

	public static void main(String[] args) {
		
//       Student[] stu = new Student[10];
//      stu[0]=new Student();
//      stu[1]=new Student();
//      //stu[2]=new Teacher();
//      
//      Object[] o = new Object[10];
//      
//      o[0]=new Student();
//      o[1]= new Teacher();
//      
//    //  Arrays.sort(o);
//      
//    , System.out.println(o[0]);
//      
//      Teacher t = (Teacher)o[1];
//      System.out.println(t);
//      
//    
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(12);
		al.add(6);
		al.add(105);
		al.add(127);
		al.add(65);
		al.add(160);
		al.add(129);
		al.add(68);
		al.add(16);
		al.add(12);
		al.add(68);
		System.out.println(al);
		
		Iterator itr = al.iterator();
		System.out.print("[ ");
		while(itr.hasNext()) {
			System.out.print(itr.next()+", ");
		}
		
		System.out.print(" ]");
		
	}

}
