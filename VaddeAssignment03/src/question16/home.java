package question16;

class home {
	String home;
	home(String home){
		this.home = home;
	}
	@Override
	public int hashCode() {
		return (int)home.charAt(0);
	}
	@Override
	public boolean equals(Object obj) {
		return home.equals((String)obj);
	}
	

}
