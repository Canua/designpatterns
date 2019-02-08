package designpatterns.observer.publisher;

import java.util.ArrayList;

public class NewsMachine implements Publisher {
	private String title;
	private String news;
	private ArrayList observers;

	public NewsMachine() {
		observers = new ArrayList(); // ArrayList 생성
	}

	@Override
	public void add(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void delete(Observer observer) {
		int i = observers.indexOf(observer);
		if(i < 0) {
			System.out.println("해당 Observer가 존재하지 않습니다.");
		} else {
			observers.remove(i);
			System.out.println("해당 Observer를 삭제하였습니다.");	
		}
	}

	@Override
	public void notifyObserver() { // 출력
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer) observers.get(i);
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
