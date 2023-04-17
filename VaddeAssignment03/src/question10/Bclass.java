package question10;

public class Bclass extends Aclass{
	void method() throws ArithmeticException
	{
		System.out.println("Bclass");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aclass a = new Bclass();
		a.method();

	}

}
