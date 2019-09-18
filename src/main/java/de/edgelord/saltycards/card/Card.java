package de.edgelord.saltycards.card;

/**
 * A class representing a playing card.
 */
public class Card {

    /**
     * The suit of this card.
     */
    private Suit suit;

    /**
     * The rank of this card.
     */
    private Rank rank;

    /**
     * The constructor.
     *
     * @param suit the suit of the car
     * @param rank the rank of the card
     */
    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    /**
     * The constructor with switched arguments.
     *
     * @param rank the rank of the card
     * @param suit the suit of the card
     */
    public Card(Rank rank, Suit suit) {
        this.suit = suit;
        this.rank = rank;
    }

    public String getName(CardNamingRules namingRules) {
        return namingRules.getName(this);
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Card) {
            Card object = (Card) obj;

            return (getRank() == object.getRank()) && (getSuit() == object.getSuit());
        }

        return false;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", rank=" + rank +
                '}';
    }

    @Override
    protected Object clone() {
        return new Card(suit, rank);
    }

    /**
     * The four suits of playing cards,
     * 1. Spades
     * 2. Hearts
     * 3. Diamonds
     * 4. Clubs
     */
    public enum Suit {
        /**
         * The Spades suit of french playing cards.
         */
        SPADES,

        /**
         * The Hearts suit of french playing cards.
         */
        HEARTS,

        /**
         * The Diamonds suit of french playing cards.
         */
        DIAMONDS,

        /**
         * The Clubs of french playing cards.
         */
        CLUBS;

        public static Suit getByValue(int value) {
            switch (value) {
                case 1 :
                    return SPADES;
                case 2 :
                    return HEARTS;
                case 3 :
                    return DIAMONDS;
                case 4:
                    return CLUBS;
            }

            throw new IllegalArgumentException("rank value must be between (inclusively) 1 and 4");
        }

        public static int getValueBySuit(Suit suit) {
            switch (suit) {
                case SPADES:
                    return 1;
                case HEARTS:
                    return 2;
                case DIAMONDS:
                    return 3;
                case CLUBS:
                    return 4;
            }

            return 0;
        }

        /**
         * Returns the name of the given suit according to {@link SuitNamingRules#DEFAULT_ENGLISH_RULES}.
         *
         * @param suit the suit
         * @return the default english name of the given suit
         */
        public static String getSuitName(Suit suit) {
            return SuitNamingRules.DEFAULT_ENGLISH_RULES.getName(suit);
        }

        /**
         * Returns the name of the given suit according to the given {@link SuitNamingRules}.
         *
         * @param suit the suit
         * @param namingRules the naming rules
         * @return the name of the suit according to the given rules
         */
        public static String getSuitName(Suit suit, SuitNamingRules namingRules) {
            return namingRules.getName(suit);
        }
    }

    /**
     * The ranks that a playing card can have, from 2 to 10, Jack, Queen, King and Ace.
     */
    public enum Rank {
        RANK_2, /*2*/
        RANK_3, /*3*/
        RANK_4, /*4*/
        RANK_5, /*5*/
        RANK_6, /*6*/
        RANK_7, /*7*/
        RANK_8, /*8*/
        RANK_9, /*9*/
        RANK_10, /*10*/
        RANK_JACK, /*11*/
        RANK_QUEEN, /*12*/
        RANK_KING, /*13*/
        RANK_ACE; /*14*/

        /**
         * The numeric value of the {@link #RANK_JACK}.
         */
        public static final int VALUE_JACK = 11;

        /**
         * The numeric value of the {@link #RANK_QUEEN}.
         */
        public static final int VALUE_QUEEN = 12;

        /**
         * The numeric value of the {@link #RANK_KING}.
         */
        public static final int VALUE_KING = 13;

        /**
         * The numeric value of the {@link #RANK_ACE}.
         */
        public static final int VALUE_ACE = 14;

        /**
         * Returns the numeric value of the given <code>Rank</code>.
         * The {@link #RANK_ACE} is 14, and only 14.
         *
         * @param rank the rank
         * @return the value of the given <code>Rank</code>.
         */
        public static int getRankValue(Rank rank) {
            switch (rank) {

                case RANK_2:
                    return 2;
                case RANK_3:
                    return 3;
                case RANK_4:
                    return 4;
                case RANK_5:
                    return 5;
                case RANK_6:
                    return 6;
                case RANK_7:
                    return 7;
                case RANK_8:
                    return 8;
                case RANK_9:
                    return 9;
                case RANK_10:
                    return 10;
                case RANK_JACK:
                    return VALUE_JACK;
                case RANK_QUEEN:
                    return VALUE_QUEEN;
                case RANK_KING:
                    return VALUE_KING;
                case RANK_ACE:
                    return VALUE_ACE;
            }

            return 0;
        }

        public static Rank getByValue(int value) {
            switch (value) {
                case 2 :
                    return RANK_2;
                case 3 :
                    return RANK_3;
                case 4 :
                    return RANK_4;
                case 5 :
                    return RANK_5;
                case 6 :
                    return RANK_6;
                case 7 :
                    return RANK_7;
                case 8 :
                    return RANK_8;
                case 9 :
                    return RANK_9;
                case 10 :
                    return RANK_10;
                case 11 :
                    return RANK_JACK;
                case 12 :
                    return RANK_QUEEN;
                case 13 :
                    return RANK_KING;
                case 14 :
                    return RANK_ACE;

            }

            throw new IllegalArgumentException("rank value must be between (inclusively) 2 and 14");
        }

        /**
         * Returns the value of the given {@link Rank} following {@link RankNamingRules#SIMPLE_RANK_NAMES}.
         *
         * @param rank the rank
         * @return a simple version of the name of the given rank
         */
        public static String getSimpleRankString(Rank rank) {

            return getRankString(rank, RankNamingRules.SIMPLE_RANK_NAMES);
        }

        /**
         * Returns the value of the given {@link Rank} following {@link RankNamingRules#EXTENDED_RANK_NAMES}.
         *
         * @param rank the rank
         * @return an extended version of the name of the given rank
         */
        public static String getExtendedRankString(Rank rank) {

            return getRankString(rank, RankNamingRules.EXTENDED_RANK_NAMES);
        }

        /**
         * Returns the value of the given <code>Rank</code> following the given rules.
         *
         * @param rank the rank
         * @param rules the naming rules
         * @return the value of the given rank named by the given rules
         */
        private static String getRankString(Rank rank, RankNamingRules rules) {
            return rules.getName(rank);
        }
    }
}
