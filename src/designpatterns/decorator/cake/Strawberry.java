package designpatterns.decorator.cake;

public class Strawberry extends decorationSweet {
	Cake cake;
	
	public Strawberry(Cake cake) {
		this.cake = cake;
	}
	@Override
	public String description() {
		return cake.description() + ", 딸기";
	}

	@Override
	public float cost() {
		return cake.cost() + 100.0f;
	}
	
}
