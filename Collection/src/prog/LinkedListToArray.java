package prog;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListToArray {

	public static void main(String[] args) {
		LinkedList<String> ll1=new LinkedList();
		ll1.add("Apple");
		ll1.add("Mango");
		ll1.add("Grape");
		ll1.add("Apple");
		ArrayList al = new ArrayList(ll1);
		System.out.println(al);
		
		System.out.println(ll1 instanceof Serializable);
		System.out.println(ll1 instanceof Cloneable);
		System.out.println(al instanceof Serializable);
		System.out.println(al instanceof Cloneable);

	}
}
