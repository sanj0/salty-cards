package de.edgelord.saltycards.card;

import de.edgelord.saltycards.NamingRules;

/**
 * An abstract implementation of {@link NamingRules} that names {@link Card}s.
 * For this, it uses {@link #rankNamingRules} and {@link #suitNamingRules}.
 */
public abstract class CardNamingRules implements NamingRules<Card> {

    protected RankNamingRules rankNamingRules;
    protected SuitNamingRules suitNamingRules;


    public CardNamingRules(RankNamingRules rankNamingRules, SuitNamingRules suitNamingRules) {
        this.rankNamingRules = rankNamingRules;
        this.suitNamingRules = suitNamingRules;
    }

    public static CardNamingRules DEFAULT_EXTENDED_ENGLISH_RULES = new EnglishCardNamingRules(RankNamingRules.EXTENDED_RANK_NAMES, SuitNamingRules.DEFAULT_ENGLISH_RULES);

    public RankNamingRules getRankNamingRules() {
        return rankNamingRules;
    }

    public void setRankNamingRules(RankNamingRules rankNamingRules) {
        this.rankNamingRules = rankNamingRules;
    }

    public SuitNamingRules getSuitNamingRules() {
        return suitNamingRules;
    }

    public void setSuitNamingRules(SuitNamingRules suitNamingRules) {
        this.suitNamingRules = suitNamingRules;
    }
}
