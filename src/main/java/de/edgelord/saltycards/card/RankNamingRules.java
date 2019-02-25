package de.edgelord.saltycards.card;

import de.edgelord.saltycards.NamingRules;

/**
 * Rules for naming a {@link de.edgelord.saltycards.card.Card.Rank}.
 * The default implementation of {@link #getName(Card.Rank)} returns <code>1</code> to <code>10</code> fro the values 1 to 10
 * and {@link #jack} for the value 11, {@link #queen} for 12, {@link #king} for 13 and {@link #ace} for 14.
 * {@link #SIMPLE_RANK_NAMES} and {@link #EXTENDED_RANK_NAMES} are default available instances.
 */
public class RankNamingRules implements NamingRules<Card.Rank> {

    /**
     * The name for the {@link de.edgelord.saltycards.card.Card.Rank#RANK_JACK}
     */
    private String jack;

    /**
     * The nam for the {@link de.edgelord.saltycards.card.Card.Rank#RANK_QUEEN}
     */
    private String queen;

    /**
     * The name for the {@link de.edgelord.saltycards.card.Card.Rank#RANK_KING}
     */
    private String king;

    /**
     * The name for the {@link de.edgelord.saltycards.card.Card.Rank#RANK_ACE}
     */
    private String ace;

    /**
     * The default simple name for {@link #jack}
     */
    public static final String SIMPLE_RANK_JACK = "J";

    /**
     * The default simple name for {@link #queen}
     */
    public static final String SIMPLE_RANK_QUEEN = "Q";

    /**
     * The default simple name for {@link #king}
     */
    public static final String SIMPLE_RANK_KING = "K";

    /**
     * The default simple name for {@link #ace}
     */
    public static final String SIMPLE_RANK_ACE = "A";

    /**
     * The default extended name for {@link #jack}
     */
    public static final String EXTENDED_RANK_JACK = "Jack";

    /**
     * The default extended name for {@link #queen}
     */
    public static final String EXTENDED_RANK_QUEEN = "Queen";

    /**
     * The default extended name for {@link #king}
     */
    public static final String EXTENDED_RANK_KING = "King";

    /**
     * The default extended name for {@link #ace}
     */
    public static final String EXTENDED_RANK_ACE = "Ace";

    /**
     * The constructor.
     *
     * @param jack the name for {@link de.edgelord.saltycards.card.Card.Rank#RANK_JACK}
     * @param queen the name for {@link de.edgelord.saltycards.card.Card.Rank#RANK_QUEEN}
     * @param king the name for {@link de.edgelord.saltycards.card.Card.Rank#RANK_KING}
     * @param ace the name for {@link de.edgelord.saltycards.card.Card.Rank#RANK_ACE}
     */
    public RankNamingRules(String jack, String queen, String king, String ace) {
        this.jack = jack;
        this.queen = queen;
        this.king = king;
        this.ace = ace;
    }

    /**
     * The default rule for simple names.
     *
     * - 11 (Jack) - {@code J}
     * - 12 (Queen) - {@code Q}
     * - 13 (Queen) - {@code K}
     * - 14 (Queen) - {@code A}
     */
    public static RankNamingRules SIMPLE_RANK_NAMES = new RankNamingRules(SIMPLE_RANK_JACK, SIMPLE_RANK_QUEEN, SIMPLE_RANK_KING, SIMPLE_RANK_ACE);

    /**
     * The default rule for simple names.
     *
     * - 11 (Jack) - {@code J}
     * - 12 (Queen) - {@code Q}
     * - 13 (Queen) - {@code K}
     * - 14 (Queen) - {@code A}
     */
    public static RankNamingRules EXTENDED_RANK_NAMES = new RankNamingRules(EXTENDED_RANK_JACK, EXTENDED_RANK_QUEEN, EXTENDED_RANK_KING, EXTENDED_RANK_ACE);

    /**
     * Returns the name of the given {@link de.edgelord.saltycards.card.Card.Rank} according to the specified rules.
     *
     * @param rank the rank
     * @return the name of the given rank
     */
    public String getName(Card.Rank rank) {

        int value = Card.Rank.getRankValue(rank);

        if (value <= 10) {
            return String.valueOf(value);
        } else if (value == Card.Rank.VALUE_JACK) {
            return jack;
        } else if (value == Card.Rank.VALUE_QUEEN) {
            return queen;
        } else if (value == Card.Rank.VALUE_KING) {
            return king;
        } else if (value == Card.Rank.VALUE_ACE) {
            return ace;
        }

        return "0";
    }
}
