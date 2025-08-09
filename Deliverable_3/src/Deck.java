import java.util.*;

public class Deck {
    private List<PokemonCard> cards;

    public Deck(List<PokemonCard> cards) {
        this.cards = new ArrayList<>(cards);
        Collections.shuffle(this.cards);
    }

    public Card drawCard() {
        if (cards.isEmpty()) return null;
        return cards.remove(0);
    }
}
