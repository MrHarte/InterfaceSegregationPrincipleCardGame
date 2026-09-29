import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Hand implements CardSource, Iterable<Card>, Sortable<Card> {
    ArrayList<Card> hand = new ArrayList<Card>();

    public void addCard(Card card){
        hand.add(card);
    }

    public int size() {
        return this.hand.size();
    }

    @Override
    public Card draw() {
        if(isEmpty()) {
            throw new IllegalStateException("Cannot draw from an empty hand.");
        }
        return this.hand.removeFirst();
    }

    @Override
    public boolean isEmpty() {
        return this.hand.isEmpty();
    }

    public void sort(Comparator<Card> sortingStrategy) {
        Collections.sort(this.hand, sortingStrategy);
    }

    @Override
    public void sort() {
        Collections.sort(this.hand);
    }

    @Override
    public Iterator<Card> iterator() {
        return this.hand.iterator();
    }
}
