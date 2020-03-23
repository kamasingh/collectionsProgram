package prog;

import java.util.ArrayList;
import java.util.List;

public class P4 {

	public static void main(String[] args) {
		 ArrayList<Integer> obj1=new ArrayList();
	        obj1.add(1000);
	        obj1.add(5000);
	        obj1.add(2000);
	        obj1.add(700);
	        System.out.println(obj1);
	        List<Integer> list=new ArrayList<Integer>();
	        list.add(20000);
	        System.out.println(obj1.containsAll(list)); 
	}
}
