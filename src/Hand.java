import java.util.*;

public class Hand implements Iterable<Card>, Sortable<Card>, CardSource{
    private final List<Card> aHand = new ArrayList<>();
    private Card aCard;

    public void addCard(Card pCard) {
        if (pCard == null) {
            throw new IllegalArgumentException("Card cannot be null.");
        }

        this.aCard = pCard;

        aHand.add(this.aCard);
    }

    public int size() {
        return this.aHand.size();
    }

    @Override
    public Card draw() {
        if (aHand.isEmpty()) {
            throw new IllegalStateException("Cannot draw from an empty hand.");
        }
        return aHand.remove(this.aHand.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return this.aHand.isEmpty();
    }

    @Override
    public void sort(Comparator<Card> comparator) {
        aHand.sort(comparator);
    }

    @Override
    public void sort() {
        Collections.sort(aHand);
    }

    @Override
    public Iterator<Card> iterator() {
        return (Collections.unmodifiableList(aHand)).iterator();
    }
}
