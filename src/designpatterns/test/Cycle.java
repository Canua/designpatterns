package designpatterns.test;

public class Cycle extends Vehicle {
	@Override
	public String description() {
		return super.description() + "Cycle (= 자전거 )";
	}

	@Override
	public void run() {
//		super.run();
		System.out.println("자전거가 달린다.");
	}
	
}
