package designpatterns.test;

public class MainApp {
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		System.out.println("Vehicle : " + v1.description() + " : " );
		Vehicle car1 = new Car();
		Car car2 = new Car();
		System.out.println("Car : " + car1.description() + " : ");
		System.out.println("Car : " + car2.description() + " : " );
		car2.run();
		
		Vehicle cycle = new Cycle();
		System.out.println("Cycle : " + cycle.description());
		cycle.run();
	}
}
