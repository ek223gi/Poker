package src;

import java.util.ArrayList;

public class Player {
    private int money;
    private String card1;
    private String card2;

    public Player(ArrayList<String> arrp){

        card1 = arrp.get(0);
        card2 = arrp.get(1);
    }

    public String getCard1(){return card1.toString();}

    public String getCard2(){return card2.toString();}

    public int getMoney(){return money;}

    public void bid(int bid){money -= bid;}
}
