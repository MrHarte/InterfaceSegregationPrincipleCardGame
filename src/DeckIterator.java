import java.util.Iterator;
import java.util.List;

public class DeckIterator implements Iterator<Card> {
    private final List<Card> aCards;
    private int index;

    public DeckIterator(List<Card> pCards) {
        this.aCards = pCards;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index + 1 <= this.aCards.size();
    }

    @Override
    public Card next() {
        return this.aCards.get(index++);
    }
}
