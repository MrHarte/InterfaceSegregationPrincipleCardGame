void main() {
    Deck deck = new Deck();
    deck.shuffle();
    System.out.println(drawCards(deck, 4));

}

public static List<Card> drawCards(CardSource pDeck, int pNumber) {
    if (pDeck == null) {
        throw new IllegalArgumentException("Cannot draw from an inexistant deck.");
    }
    List<Card> result = new ArrayList<>();

    for (int i = 0; i < pNumber && !pDeck.isEmpty(); i++) {
        result.add(pDeck.draw());
    }

    return result;
}