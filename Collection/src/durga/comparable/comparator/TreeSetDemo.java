package durga.comparable.comparator;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
	
		TreeSet t = new TreeSet(new MyComparator());
		t.add(10);
		t.add(20);
		t.add(25);
		t.add(5);
		t.add(2);
		t.add(56);
		System.out.println(t);

	}

}
