package designpatterns.observer.publisher;

public class mainApp {
	public static void main(String[] args) {
		NewsMachine newsMachine = new NewsMachine();
		AnnualSubscriber annulSubscriber = new AnnualSubscriber(newsMachine);
		EventSubscriber eventSubcriber = new EventSubscriber(newsMachine);

		newsMachine.setNewsInfo("봄날", "여러분 봄입니다.");

		newsMachine.delete(annulSubscriber);
		newsMachine.setNewsInfo("겨울", "추워요.");

	}
}
