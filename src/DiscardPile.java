import java.util.ArrayList;
import java.util.List;

public class DiscardPile implements CardSource {
    private List<Card> aCards = new ArrayList<>();

    public void discard(Card pCard) {
        this.aCards.add(pCard);
    }

    @Override
    public Card draw() {
        if(isEmpty()) {
            throw new IllegalStateException("Cannot draw from an empty deck.");
        }
        return aCards.removeLast();
    }

    @Override
    public boolean isEmpty() {
        return this.aCards.isEmpty();
    }
}
