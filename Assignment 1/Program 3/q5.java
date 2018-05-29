class Cycle {

}

class Unicycle extends Cycle {
	public String toString() {
		return "Unicycle";
	}

}

class Bicycle extends Cycle {
	public String toString() {
		return "Bicycle";
	}

}

class Tricycle extends Cycle {
	public String toString() {
		return "Tricycle";
	}

}

public class q5 {
	public static void ride (Cycle c) {
		System.out.println("Riding a " + c.toString());
	}
	public static void main(String[] args) {
		Unicycle u = new Unicycle();
		Bicycle b = new Bicycle();
		Tricycle t = new Tricycle();
		ride(u);
		ride(b);
		ride(t);
	}
}