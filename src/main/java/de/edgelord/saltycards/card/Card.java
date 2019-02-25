package de.edgelord.saltycards.card;

public class Card {
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
