package question1;

public class generics {
	public static < E > void printArray(E[] inputArray) {
		for(E emnt : inputArray) {
			System.out.printf("%s" , emnt);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Integer[] itgrArray = {9,8,7,6,5};
		Double[] dbleArray = {9.7,1.6,2.5,3.4,4.3,5.2};
		Character[] chrcterArray = {'t','o','d','a','y'};
		
		System.out.println("itgr Array contains:");
		printArray(itgrArray);
		
		System.out.println("dble Array contains:");
		printArray(dbleArray);
		
		System.out.println("chrcter Array contains:");
		printArray(chrcterArray);

	}

}
