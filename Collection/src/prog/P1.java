package prog;

import java.util.ArrayList;
import java.util.Collections;

public class P1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al1=new ArrayList();
		al1.add(10);
		al1.add(200);
		al1.add(30);
		al1.add(100);
	//	System.out.println(al1);
		ArrayList<Integer> al2=new ArrayList(al1);
		al2.addAll(al1);
		al2.add(560);
		System.out.println(al2);
		Collections.swap(al1, 0, 1);
		System.out.println(al1);
	}
}
