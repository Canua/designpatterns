package designpatterns.observer.publisher;

public class EventSubscriber implements Observer {
	private String newsString;
	private Publisher publisher;

	public EventSubscriber(Publisher publisher) {
		this.publisher = publisher;
		publisher.add(this);
	}

	@Override
	public void update(String title, String news) {
		this.newsString = title + " \n -------- \n " + news;
		display();
	}

	public void display() {
		System.out.println("-------이벤트----------\n" + newsString);
	}

}
