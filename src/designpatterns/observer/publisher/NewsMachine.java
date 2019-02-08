package designpatterns.observer.publisher;

import java.util.ArrayList;

public class NewsMachine implements Publisher {
	private String title;
	private String news;
	private ArrayList<Observer> observers;

	public NewsMachine() {
		observers = new ArrayList();
	}

	@Override
	public void add(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void delete(Observer observer) {
		int i = observers.indexOf(observer);
		observers.remove(i);
		System.out.println("삭제된 후 observers의 개수 : " + observers.size());
	}

	@Override
	public void notifyObserver() {
		for (Observer observer : observers) {
			observer.update(title, news);
		}
	}

	public void setNewsInfo(String title, String news) {
		this.title = title;
		this.news = news;
		notifyObserver();
	}

	public String getTitle() {
		return title;
	}

	public String getNews() {
		return news;
	}

}
