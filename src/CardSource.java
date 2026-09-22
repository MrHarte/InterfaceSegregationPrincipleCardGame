public interface CardSource {
    /**
     * Returns a card from the source.
     *
     * @return The next available card.
     */
    Card draw();

    /**
     * Checks whether source is empty.
     * @return True, if there is no card in the source. Else otherwise.
     */
    boolean isEmpty();
}
