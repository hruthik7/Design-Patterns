package question13;
import java.io.*;
import java.util.*;

class YTR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> h1 = new ArrayList<String>();
		h1.add("a.com");
		h1.add("b.com");
		h1.add("c.com");
		h1.add("d.com");
		
		System.out.println("Arraylist elements are :");
		Iterator it = h1.iterator();
		while(it.hasNext())
			System.out.println(it.next());

		
		Vector<String> j = new Vector<String>();
		j.addElement("kok");
		j.addElement("kkl");
		j.addElement("kpp");
		
		System.out.println("\nvector elements are:");
		Enumeration t = j.elements();
		while(t.hasMoreElements())
			System.out.println(t.nextElement());
		
	}

}
