package designpatterns.observer;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
		WeatherBroadcast weatherBroadcast = new WeatherBroadcast(weatherData);
		
		
		
		System.out.println("-- WeatherStation input Data : 70, 50, 30.2f --");
		weatherData.setMeasurements(70, 50, 30.2f);
		System.out.println("-- WeatherStation input Data : 74, 40, 10.2f --");
		weatherData.setMeasurements(44, 40, 10.2f);
		System.out.println("------------- WeatherBroadcast Observer remove -------------");
		weatherData.removeObserver(weatherBroadcast);
		System.out.println("-- WeatherStation input Data : 54, 54, 40.2f --");
		weatherData.setMeasurements(54, 54, 40.2f);
		
		
		

	}

}
