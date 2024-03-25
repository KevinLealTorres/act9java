import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;

    /**
     * Constructor
    */
    public Deck() {
        cards = new ArrayList<>();
        initializeDeck();
    }

    /**
     * Inicializa el mazo con las 52 cartas estándar de poker.
     */
    private void initializeDeck() {
        final String[]  SUITS   = {"Tréboles", "Corazones", "Picas", "Diamantes"},
                        VALUES  = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};

        for (String suit : SUITS) {
            String color = (suit.equals("Corazones") || suit.equals("Diamantes")) ? "Rojo" : "Negro";
            for (String value : VALUES) {
                cards.add(new Card(suit, color, value));
            }
        }
    }

    /**
     * Mezcla las cartas del mazo de manera aleatoria.
     */
    public void shuffle() {
        Collections.shuffle(cards);
        System.out.println("Se mezcló el Deck.");
    }

    /**
     * Muestra y elimina la primera carta del mazo.
     */
    public void head() {
        if (!cards.isEmpty()) {
            Card card = cards.remove(0);
            System.out.println(card);
            System.out.println("Quedan " + cards.size());
        }
    }

    /**
     * Imprime la carta que se va a eliminar inmediatamente después
    */
    public void pick() {
        if (!cards.isEmpty()) {
            int randomIndex = (int) (Math.random() * cards.size());
            Card card = cards.remove(randomIndex);
            System.out.println(card);
            System.out.println("Quedan " + cards.size());
        }
    }

    /**
     * Extrae y muestra un conjunto de cinco cartas del mazo.
     */
    public void hand() {
        if (cards.size() >= 5) {
            for (int i = 0; i < 5; i++) {
                Card card = cards.remove(0);
                System.out.println(card);
            }
            System.out.println("Quedan " + cards.size());
        }
    }
}
