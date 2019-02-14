package designpatterns.test;

public class Car extends Vehicle {
	@Override
	public String description() {
		return super.description() + "Car (= 자동차 )"; 
	} 
	public void run() {
		System.out.println("달릴 수 있다.");
	}
	
}
