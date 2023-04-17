package question12;

public class R {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int q = 10;
			int e = 0;
			int result = q/e;
		}catch(Exception l) {
			System.out.println("Error "+l.getMessage());
		}finally {
			System.out.println("Completed.");
		}

	}

}
