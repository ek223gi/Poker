package src;

public class main {

	public static void main(String[] args) {
		Cards cards = new Cards();
		Player player1 = new Player(cards.generatePlayerCards());
		Player player2 = new Player(cards.generatePlayerCards());
		Middle middle = new Middle(cards.generateMiddle());

		System.out.println("Player 1: " + player1.getCard1() + " and " + player1.getCard2());
        System.out.println();

        System.out.println("Player 2: " + player2.getCard1() + " and " + player2.getCard2());
		System.out.println();

		System.out.println(middle.getCard1());
		System.out.println(middle.getCard2());
		System.out.println(middle.getCard3());
		System.out.println(middle.getCard4());
		System.out.println(middle.getCard5());


	}

}
