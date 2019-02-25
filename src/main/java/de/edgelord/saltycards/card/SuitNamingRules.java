package de.edgelord.saltycards.card;

import de.edgelord.saltycards.NamingRules;

public class SuitNamingRules implements NamingRules<Card.Suit> {

    /**
     * The name for {@link de.edgelord.saltycards.card.Card.Suit#SPADES}.
     */
    private String spades;

    /**
     * The name for {@link de.edgelord.saltycards.card.Card.Suit#HEARTS}.
     */
    private String hearts;

    /**
     * The name for {@link de.edgelord.saltycards.card.Card.Suit#DIAMONDS}.
     */
    private String diamonds;

    /**
     * The name for {@link de.edgelord.saltycards.card.Card.Suit#CLUBS}.
     */
    private String clubs;

    public static final String DEFAULT_ENGLISH_SPADES = "Spades";
    public static final String DEFAULT_ENGLISH_HEARTS = "Hearts";
    public static final String DEFAULT_ENGLISH_DIAMONDS = "Diamonds";
    public static final String DEFAULT_ENGLISH_CLUBS = "Clubs";

    public static final SuitNamingRules DEFAULT_ENGLISH_RULES = new SuitNamingRules(DEFAULT_ENGLISH_SPADES, DEFAULT_ENGLISH_HEARTS, DEFAULT_ENGLISH_DIAMONDS, DEFAULT_ENGLISH_CLUBS);

    /**
     * The constructor.
     *
     * @param spades the name for spades
     * @param hearts the name for hearts
     * @param diamonds the name for diamonds
     * @param clubs the name for clubs
     */
    public SuitNamingRules(String spades, String hearts, String diamonds, String clubs) {
        this.spades = spades;
        this.hearts = hearts;
        this.diamonds = diamonds;
        this.clubs = clubs;
    }

    @Override
    public String getName(Card.Suit object) {
        switch (object) {
            case SPADES:
                return spades;
            case HEARTS:
                return hearts;
            case DIAMONDS:
                return diamonds;
            case CLUBS:
                return clubs;
        }

        return "unknown suit";
    }
}
