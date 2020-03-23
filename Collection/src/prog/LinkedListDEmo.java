package prog;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDEmo {

	public static void main(String[] args) {


		LinkedList<Integer> al = new LinkedList();
		al.add(10);
		al.add(12);
		al.add(6);
		al.add(105);
		al.add(127);
		al.add(65);
		al.add(null);
		al.add(129);
		al.add(68);
		al.add(null);
		al.add(12);
		al.add(68);
		al.remove(1);
		System.out.println(al);
		
		ArrayList<Integer> ay = new ArrayList(al);
		System.out.println(ay);
		Iterator itr=ay.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next() + " ");
			itr.remove();
			//System.out.print(itr.next()+" ");
		}
	}



}
