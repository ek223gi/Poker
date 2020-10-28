package main;

import Card.Card;

public class main {

	public static void main(String[] args) {
		Card card1;
		Card card2;
		
		for(int i = 0; i < 5; i++) {
			
		System.out.println("Player: " + (i+1));
			
		card1 = new Card();
		System.out.println("First card is " + card1.getChr() + " of " + card1.getSymbol());

		card2 = new Card();
		System.out.println("Second card is " + card2.getChr() + " of " + card2.getSymbol());
		System.out.println();
		
		}
	}

}
