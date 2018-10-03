public class Kitty {
	//fields
	private int age;
	private String name;
	//constructors
	public Kitty() {
		name = "Mittens";
		age = 2;
	}
	public Kitty(String x, int y) {
		name = x;
		age = y;	
	}
	//accessor methods
	public String getName() {
		return name;	
	}
	public int getAge() {
		return age;
	}
	public void changeName(String x) {
		name = x;
	}
	public void makeOlder() {
		age+=1;
	}
	public String toString() {
		return "the amazing " + name;	
	}
}
