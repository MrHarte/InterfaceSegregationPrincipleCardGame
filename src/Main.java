void main() {


    Hand hand = new Hand();

    hand.addCard(new Card(Rank.ACE, Suit.SPADES));
    hand.addCard(new Card(Rank.TEN, Suit.HEARTS));
    hand.addCard(new Card(Rank.KING, Suit.CLUBS));

    hand.sort();

    for (Card card : hand) {
        System.out.println(card);
    }

    System.out.println(hand.draw());
}

