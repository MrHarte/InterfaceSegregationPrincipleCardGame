import java.util.ArrayList;
import java.util.List;

public class DiscardPile implements CardSource {
    private List<Card> aCards = new ArrayList<>();

    @Override
    public Card draw() {
        return aCards.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return this.aCards.isEmpty();
    }
}
