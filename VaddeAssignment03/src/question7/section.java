package question7;

public class section {
	public final String name;
	public final int age;
	
	public section(){
		this.name = "hru";
		this.age = 16;
	}
	public void display() {
		System.out.println("student name is"+this.name);
		System.out.println("student age is"+this.age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new section().display();
		

	}

}
