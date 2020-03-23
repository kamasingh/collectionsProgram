package prog;

import java.util.ArrayList;

public class P5 {

	public static void main(String[] args) {
		ArrayList<String> al1=new ArrayList();
		al1.add("Hello");
		al1.add("hai");
		al1.add("iam");
		System.out.println(al1);
		String[] a=new String[al1.size()];
		al1.toArray(a);
		for(String str:a) {
			
			System.out.println(str);
			
	}
}
}