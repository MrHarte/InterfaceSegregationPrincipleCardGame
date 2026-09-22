import java.util.Comparator;

public class SuitFirstComparator implements Comparator<Card> {
    @Override
    public int compare(Card card1, Card card2) {
        int rankDiff = card1.getRank().compareTo(card2.getRank());
        int suitDiff = card1.getSuit().ordinal() - card2.getSuit().ordinal();

        if (suitDiff == 0)
            return rankDiff;
        else
            return suitDiff;
    }
}
