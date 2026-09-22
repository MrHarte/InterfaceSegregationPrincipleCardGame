public class Card implements Comparable<Card> {
    private final Rank aRank;
    private final Suit aSuit;

    /**
     * Constructor to create a new card.
     *
     * @param pRank Rank of the Card
     * @param pSuit Suit of the Card
     * @throws IllegalArgumentException If Rank or Suit is null.
     */
    public Card(Rank pRank, Suit pSuit) {
        if (pRank == null || pSuit == null) {
            throw new IllegalArgumentException("Rank and Suit of a Card cannot be null.");
        }
        this.aRank = pRank;
        this.aSuit = pSuit;
    }

    public Rank getRank() {
        return this.aRank;
    }

    public Suit getSuit() {
        return this.aSuit;
    }

    @Override
    public String toString() {
        return this.aRank + " of " + this.aSuit;
    }

    public int compareTo(Card o) {
        int rankDiff = this.aRank.compareTo(o.getRank());
        int suitDiff = this.aSuit.ordinal() - o.getSuit().ordinal();

        if (suitDiff == 0)
            return rankDiff;
        else
            return suitDiff;
    }
}
