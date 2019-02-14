package designpatterns.decorator.cake;

public class CreamCake extends Cake {

	public CreamCake() {
		description = "크림 케이크";
	}

	@Override
	public float cost() {
		return 2000.0f;
	}
	
}
