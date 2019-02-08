package designpatterns.observer;

public class WeatherBroadcast implements Observer, DisplayElement {
	private Subject WeatherData;
	private String broadcast = "";

	public WeatherBroadcast(Subject weatherData) {
		this.WeatherData = weatherData;
		weatherData.registerObserver(this);
		
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		String brocastset = "";
		brocastset += (temp > 50) ? "온도가 높고 " : "온도가 낮고 ";
		brocastset += (humidity > 50) ? "습도가 높은 " : "습도가 낮은 ";
		broadcast = brocastset;
		display();
	}

	@Override
	public void display() {
		System.out.println("Weather BroadCast : " + broadcast + "날씨입니다.");
	}
}
