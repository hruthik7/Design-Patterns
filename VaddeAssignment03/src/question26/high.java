package question26;

public class high {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		low a = low.getInstance();
		low ab = low.getInstance();
		low abc = low.getInstance();
		
		System.out.println("Hashcode of a is" +a.hashCode() );
		System.out.println("Hashcode of ab is" +ab.hashCode() );
		System.out.println("Hashcode of abc is" +abc.hashCode() );
		
		if(a == ab && ab == abc) {
			System.out.println("objects of three are related to the same memory location of heap");
		}
		else {
			System.out.println("objects of three are not related to the same memory location of heap");
		}

	}

}
