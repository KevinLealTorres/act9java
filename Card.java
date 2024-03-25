
public class Card {
    private String suit, color, value; 

    /**
     * Constructor
     * 
     * @param suit El palo de la carta (tréboles, corazones, picas, diamantes).
     * @param color El color de la carta (rojo, negro).
     * @param value El valor de la carta (2-10, A, J, Q, K).
     */
    public Card(String suit, String color, String value) {
        this.suit = suit;
        this.color = color;
        this.value = value;
    }

    public String getSuit() { return suit; }
    public String getColor() { return color; }
    public String getValue() { return value; }

    /**
     * Retorna las características de la carta.
     * 
     * @return String que representa la carta.
     */
    @Override
    public String toString() {
        return suit + "," + color + "," + value;
    }
}
