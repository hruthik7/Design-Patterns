package question12;

public class R1 {
	public void finalize() throws Throwable{
		System.out.println("object collected.");
	}
	public static void main(String[] args) {
		R2 p = new R2();
		p = null;
		System.gc();
	}

}
