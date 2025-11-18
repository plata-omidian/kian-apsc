package cards;

import javax.smartcardio.Card;

public class Hand {
    private int max;
    private static String[] hand;
//constructer
    public Hand(int max){
        this.max=max;
    }
//methods
    public void add(Card){
        if(hand.length<max){
            hand.add(Card);
        }
        else{
            System.out.println("no can do bud, your hand is full");
        }
    }
    public int length(){
        return(hand.length);
    }
    public String get(){
        return(hand[]);
    }
}
