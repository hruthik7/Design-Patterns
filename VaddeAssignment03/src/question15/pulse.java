package question15; 

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

class pulse {
	 public static void main(String args[]) {
		 Hashtable<Integer,String> ris = new Hashtable<Integer,String>();
		 ris.put(7,"kok");
		 ris.put(97,"lpo");
		 ris.put(79,"kuuk");
		 ris.put(907,"kke");
		 System.out.println("-------------Hash table-------------");
		 for(Map.Entry l:ris.entrySet()) {
			 System.out.println(l.getKey()+" "+l.getValue());
		 }
		 HashMap<Integer,String> rish = new HashMap<Integer,String>();
		 rish.put(9,"hok");
		 rish.put(79,"kop");
		 rish.put(966,"hokll");
		 rish.put(911,"ffhok");
		 System.out.println("--------------Hash Map--------------");
		 for(Map.Entry l:rish.entrySet()) {
			 System.out.println(l.getKey()+" "+l.getValue());
	 }}
	

}
