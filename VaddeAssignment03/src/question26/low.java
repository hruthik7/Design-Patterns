package question26;

public class low {
	private static low ONE_instance = null;
	public String y;
	private low() {
		y = "hello this is a singleton clas";
	}
	public static low getInstance() {
		if(ONE_instance == null)
			ONE_instance = new low();
		
		return ONE_instance;
	}

}
