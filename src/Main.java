void main() {
    Deck deck = new Deck();
    deck.shuffle();
    System.out.println(drawCards(deck, 4));

    deck.sort(new RankFirstComparator());
    System.out.println(drawCards(deck, 8));

    deck.sort(new SuitFirstComparator());
    System.out.println(drawCards(deck, 8));

    for (Card card : deck) {
        System.out.println(card);
    }

    DiscardPile pile = new DiscardPile();
    drawCards(pile, 4);

    System.out.println("Playing with a hand deck.");

    Hand hand = new Hand();

    hand.addCard(new Card(Rank.ACE, Suit.SPADES));
    hand.addCard(new Card(Rank.TEN, Suit.HEARTS));
    hand.addCard(new Card(Rank.KING, Suit.CLUBS));

    hand.sort();

    for(Card card : hand)
    {
        System.out.println(card);
    }

    System.out.println(hand.draw());
}

public static List<Card> drawCards(CardSource pDeck, int pNumber) {
    if (pDeck == null) {
        throw new IllegalArgumentException("Cannot draw from an inexistent deck.");
    }
    List<Card> result = new ArrayList<>();

    for (int i = 0; i < pNumber && !pDeck.isEmpty(); i++) {
        result.add(pDeck.draw());
    }

    return result;
}