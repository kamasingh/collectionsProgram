package prog;

import java.util.ArrayList;
import java.util.Collections;

public class P2 {

	public static void main(String[] args) {
		ArrayList<String> al1=new ArrayList();
		al1.add("kama");
		al1.add("s");
		al1.add("srisha");
		al1.add("srinika");
		System.out.println(al1);
		Collections.shuffle(al1);
		System.out.println(al1);
		Collections.shuffle(al1);
		System.out.println(al1);
	}
}
