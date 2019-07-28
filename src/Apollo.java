
public class Apollo extends SpaceCraft implements Drive, Shuttle {
	private int nowheel;

	public Apollo(String model, int nowheel) {
		super(model);
		this.nowheel = nowheel;
	}

	public void display() {
		System.out.println(model + " " + nowheel);
	}

	public void drive() {
		System.out.println("Driving.");
	}

	public void stop() {
		System.out.println("Stopped.");
	}

	public void turn() {
		System.out.println("Turned.");
	}

	public void startShuttle() {
		System.out.println("Shuttle Started");
	}

	public void stopShuttle() {
		System.out.println("Shuttle Stopped.");
	}

	public static void main(String[] args) {
		Apollo a = new Apollo("Mig32", 0);
		a.display();
		a.drive();
		a.stop();
		a.turn();
		a.startShuttle();
		a.stopShuttle();
	}

}
