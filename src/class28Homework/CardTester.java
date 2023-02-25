package class28Homework;

import java.util.Iterator;
import java.util.LinkedList;

public class CardTester {
    public static void main(String[] args) {
        LinkedList<Card> cards= new LinkedList<>();
        cards.add(new Card(0.13,"Debit"));
        cards.add(new Card(0.22, "Credit"));
        cards.add(new Card(0.10, "Prepaid"));

        for (int i = 0; i < cards.size(); i++) {
            Card card= cards.get(i);
            card.display();
        }
        System.out.println();

        for (Card c: cards){
            c.display();
        }
        System.out.println();

        Iterator <Card> iterator= cards.iterator();
        while (iterator.hasNext()){
            Card c1= iterator.next();
            c1.display();

        }
    }
}
