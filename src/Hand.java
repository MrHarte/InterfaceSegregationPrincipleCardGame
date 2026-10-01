import java.util.*;

public class Hand implements Shufflable, Sortable, CardSource, Iterable<Card> {
    private final List<Card> aCards;

    public Hand() {
        this.aCards = new ArrayList<>();
    }



    public void addCard(Card card) {
       this.aCards.add(card);
    }

    public int size() {
        return this.aCards.size();
    }

    @Override
    public void shuffle() {

    }


    @Override
    public void sort(Comparator sortingStrategy) {
        Collections.sort(aCards, sortingStrategy);
    }

    @Override
    public void sort() {
        Collections.sort(aCards);
    }

    @Override
    public Card draw() {
        if(isEmpty()) {
            throw new IllegalStateException("Cannot draw from an empty deck.");
        }
        return aCards.removeFirst();
    }

    @Override
    public boolean isEmpty() {
            return this.aCards.isEmpty();

    }
    public List<Card> getCards() {
        return Collections.unmodifiableList(this.aCards);
    }

    @Override
    public Iterator<Card> iterator() {
        return getCards().iterator();
    }
}
