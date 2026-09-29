import java.util.*;

public class Deck implements CardSource, Iterable<Card>, Sortable<Card>, Shufflable {
    private final List<Card> aCards;

    public Deck() {
        this.aCards = new ArrayList<>();
        for (Rank myRank : Rank.values()) {
            for (Suit mySuit : Suit.values()) {
                this.aCards.add(new Card(myRank, mySuit));
            }
        }
    }

    public Card getCard(int index) {
        return this.aCards.get(index);
    }

    public int size() {
        return this.aCards.size();
    }

    public List<Card> getCards() {
        return Collections.unmodifiableList(this.aCards);
    }

    public boolean isEmpty() {
        return this.aCards.isEmpty();
    }

    /**
     *
     * @return Top Card
     * @throws IllegalStateException If deck is empty.
     */
    public Card draw() {
        if(isEmpty()) {
            throw new IllegalStateException("Cannot draw from an empty deck.");
        }
        return aCards.removeFirst();
    }

    public void shuffle() {
        Collections.shuffle(aCards);
    }

    public void sort(Comparator<Card> sortingStrategy) {
        Collections.sort(aCards, sortingStrategy);
    }

    @Override
    public void sort() {
        Collections.sort(aCards);
    }

    @Override
    public Iterator<Card> iterator() {
        return getCards().iterator();
    }
}
