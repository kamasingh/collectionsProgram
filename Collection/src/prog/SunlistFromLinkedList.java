package prog;

import java.util.LinkedList;
import java.util.List;

public class SunlistFromLinkedList {

	public static void main(String[] args) {
		LinkedList ll1=new LinkedList();
		ll1.add("Apple");
		ll1.add("Mango");
		ll1.add("Grape");
		ll1.add("Aam");
		ll1.add("kela");
		ll1.add("Grkv");
		System.out.println(ll1);
		List a2 = ll1.subList(2, 5);
		System.out.println(a2);
		
	}
}
