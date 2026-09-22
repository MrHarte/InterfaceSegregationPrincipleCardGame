import java.util.Comparator;

public class RankFirstComparator implements Comparator<Card> {
    @Override
    public int compare(Card card1, Card card2) {
        int rankDiff = card1.getRank().compareTo(card2.getRank());
        int suitDiff = card1.getSuit().ordinal() - card2.getSuit().ordinal();

        if (rankDiff == 0)
            return suitDiff;
        else
            return rankDiff;
    }
}
