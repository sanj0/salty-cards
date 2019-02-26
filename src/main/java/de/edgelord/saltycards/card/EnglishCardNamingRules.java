package de.edgelord.saltycards.card;

/**
 * Names a card ike this: {@link RankNamingRules#getName(Card.Rank)} + " of " + {@link SuitNamingRules#getName(Card.Suit)}
 */
public class EnglishCardNamingRules extends CardNamingRules {

    public EnglishCardNamingRules(RankNamingRules rankNamingRules, SuitNamingRules suitNamingRules) {
        super(rankNamingRules, suitNamingRules);
    }

    @Override
    public String getName(Card object) {
        return rankNamingRules.getName(object.getRank()) + " of " + suitNamingRules.getName(object.getSuit());
    }
}
