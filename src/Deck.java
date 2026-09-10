import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> aCards;

    public Deck() {
        this.aCards = new ArrayList<Card>();
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
}
