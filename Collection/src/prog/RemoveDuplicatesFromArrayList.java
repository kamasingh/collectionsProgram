package prog;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromArrayList {

	public static void main(String[] args) {
		List<Integer> al1=new ArrayList<Integer>();
		al1.add(10);
		al1.add(200);
		al1.add(30);
		al1.add(100);
		al1.add(10);
		al1.add(30);
		
		System.out.println(al1);
		Set<Integer> lhs = new LinkedHashSet<Integer>();
		
	//	al1.clear();
		lhs.addAll(al1);
		System.out.println(lhs);
	}
}
