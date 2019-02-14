package designpatterns.decorator.cake;

public class MainApp {

	public static void main(String[] args) {
		Cake icecreamCake = new IcecreamCake();
		icecreamCake = new Strawberry(icecreamCake);
		System.out.println(icecreamCake.cost() +"원 " + icecreamCake.description() + "입니다.");
		
		Cake creamCake = new CreamCake();
		creamCake = new Strawberry(creamCake);
		System.out.println(creamCake.cost() + "원 " + creamCake.description() + " 입니다.");
	}

}
