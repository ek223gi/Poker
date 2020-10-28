package Player;

import Card.Card;

public class Player {
    Card card1;
    Card card2;

    public Player(){
        card1 = new Card();
        card2 = new Card();
    }

    public String getCard1(){return card1.toString();}

    public String getCard2(){return card2.toString();}
}
