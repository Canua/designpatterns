package designpatterns.decorator.cake;

public class IcecreamCake extends Cake {

	public IcecreamCake() {
		description = "아이스크림 케이크 "; // 인스턴스 변수인 descriptin을 받는다.
	}
	@Override
	public float cost() {
		return 4000.0f;
	}
	
}
