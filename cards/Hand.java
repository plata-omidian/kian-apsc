package cards;

import javax.smartcardio.Card;

import piglatin.string;

public class Hand {
    private int max=13;
    private static Card[] hand;
    int topNum=0;
//constructer
    public Hand(int max){
        this.max=max;
        topNum=0;
    }
//methods
    public void add(Card c){
        if(hand.length<max){
            hand[topNum]=c;
            topNum++;
        }
        else{
            System.out.println("no can do bud, your hand is full");
        }
    }
    public int length(){
        return topNum;
    }
    public Card get(int index){
        return hand[index];
    }
    public String toString(){
        String result="";
        for (int i=0;i<topNum;i++)
        {
            result+=hand[i].toString()+" ";
        }
        return result;
    }
}
