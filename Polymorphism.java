class Bird{
	public void sing() {
		System.out.println("tweet tweet tweet");
	}
}

class Robin extends Bird{
	public void sing(String song) {
		System.out.println("twiddledeedee");
	}
}

class Pelican extends Bird{
	public void sing() {
		System.out.println("KWAAH KWAAH KWAAH");
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		Robin b = new Robin();
		b.sing();

	}

}
