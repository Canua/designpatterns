package designpatterns.observer.publisher;

public class EventSubscriber implements Observer, DisplaySubscriber {
	private String title;
	private String news;
	private Publisher publisher;

	public EventSubscriber(Publisher publisher) {
		this.publisher = publisher;
		publisher.add(this);
	}

	@Override
	public void update(String title, String news) {
		this.title = title;
		this.news = news;
		display();
	}

	@Override
	public void display() {
		System.out.println("News title : " + title + "\n" 
				+ "News Contents : " + news);
	}
}
