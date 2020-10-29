package Card;

import java.util.ArrayList;
import java.util.Random;

public class Card {

	private String symbol;
	private String chr;

	private ArrayList<String> arrs = new ArrayList<String>(); //possible symbols
	private ArrayList<String> arrc = new ArrayList<String>(); //possible characters
	private ArrayList<String> arrd = new ArrayList<String>(); //already chosen cards

	private Random rnd = new Random();

	private void fillArrays() {
		arrs.add("Hearts");
		arrs.add("Clubs");
		arrs.add("Diamonds");
		arrs.add("Spades");

		arrc.add("Two");
		arrc.add("Three");
		arrc.add("Four");
		arrc.add("Five");
		arrc.add("Six");
		arrc.add("Seven");
		arrc.add("Eight");
		arrc.add("Nine");
		arrc.add("Ten");
		arrc.add("Jack");
		arrc.add("Queen");
		arrc.add("King");		
		arrc.add("Ace");
	}

	private String generateSymbol() {
		int num = rnd.nextInt(4);

		return arrs.get(num);

	}

	private String generateCharacter() {
		int num = rnd.nextInt(13);

		return arrc.get(num);

	}

	public Card() {
		fillArrays();

		symbol = generateSymbol();
		chr = generateCharacter();

		while(sameCard()) {
			symbol = generateSymbol();
			chr = generateCharacter();
		}
		
		arrd.add(getChr() + " of " + getSymbol());
	}

	public String getSymbol() {
		return symbol;
	}

	public String getChr() {
		return chr;
	}

	public boolean sameCard() {

		for(int i = 0; i < arrs.size(); i++)
			if(arrs.get(i).equals(getChr() + " of " + getSymbol()))
				return true;

		return false;

	}

	public String toString(){return getChr() + " of " + getSymbol();}





}
