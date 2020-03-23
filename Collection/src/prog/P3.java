package prog;

import java.util.ArrayList;
import java.util.Collections;

public class P3 {
public static void main(String[] args) {
	ArrayList al1=new ArrayList();
	al1.add("m");
	al1.add("e");
	al1.add("m");
	al1.add("e");
	System.out.println(al1);
	Collections.swap(al1,2,3);
	System.out.println(al1);
}
}

