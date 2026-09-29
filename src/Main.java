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