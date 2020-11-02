package src;

public class main {

	public static void main(String[] args) {
		Cards cards = new Cards();
		Player player = new Player(cards.getPlayerCards());
		Middle middle = new Middle(cards.getMiddle());


	}

}
