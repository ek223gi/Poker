package src;

import java.util.ArrayList;

public class Middle {

    private String card1;
    private String card2;
    private String card3;
    private String card4;
    private String card5;

    public Middle(ArrayList<String> arrm) {
        card1 = arrm.get(0);
        card2 = arrm.get(1);
        card3 = arrm.get(2);
        card4 = arrm.get(3);
        card5 = arrm.get(4);

    }

    public String getCard1() {return card1;}

    public String getCard2() {return card2;}

    public String getCard3() {return card3;}

    public String getCard4() {return card4;}

    public String getCard5() {return card5;}
}

