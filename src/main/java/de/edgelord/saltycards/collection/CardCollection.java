package de.edgelord.saltycards.collection;

import de.edgelord.saltycards.card.Card;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class CardCollection {

    private List<Card> cards = new ArrayList<>();
    public static final Random RNG = new Random();

    public CardCollection(Card... cards) {
        this.cards.addAll(Arrays.asList(cards));
    }

    public static CardCollection completeSet() {
        CardCollection collection = new CardCollection();

        for (int i = 1; i <= 4; i++) {
            for (int j = 2; j <= 14; j++) {
                collection.add(new Card(Card.Rank.getByValue(j), Card.Suit.getByValue(i)));
            }
        }

        return collection;
    }

    public void shuffle() {
        Collections.shuffle(cards, RNG);
    }

    /**
     * Picks a random card from {@link #cards} and removes it from the list.
     *
     * @return the picked card
     */
    public Card pickRandom() {
        int index = RNG.nextInt(cards.size());
        Card card = cards.get(index);
        cards.remove(index);
        return card;
    }

    /**
     * Picks an array of random cards from {@link #cards} and removes them from the list.
     *
     * @return the picked cards
     */
    public Card[] pickRandom(int number) {
        Card[] pickedCards = new Card[number];

        for (int i = 0; i < number; i++) {
            pickedCards[i] = pickRandom();
        }

        return pickedCards;
    }

    /**
     * Picks a random card from {@link #cards} and returns it.
     *
     * @return the picked card
     */
    public Card getRandom() {
        return cards.get(RNG.nextInt(cards.size()));
    }

    //- Start of delegated methods for cards -//

    public int size() {
        return cards.size();
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }

    public boolean contains(Object o) {
        return cards.contains(o);
    }

    public Iterator<Card> iterator() {
        return cards.iterator();
    }

    public Object[] toArray() {
        return cards.toArray();
    }

    public <T> T[] toArray(T[] a) {
        return cards.toArray(a);
    }

    public boolean add(Card card) {
        return cards.add(card);
    }

    public boolean remove(Object o) {
        return cards.remove(o);
    }

    public boolean containsAll(Collection<?> c) {
        return cards.containsAll(c);
    }

    public boolean addAll(Collection<? extends Card> c) {
        return cards.addAll(c);
    }

    public boolean addAll(int index, Collection<? extends Card> c) {
        return cards.addAll(index, c);
    }

    public boolean removeAll(Collection<?> c) {
        return cards.removeAll(c);
    }

    public boolean retainAll(Collection<?> c) {
        return cards.retainAll(c);
    }

    public void replaceAll(UnaryOperator<Card> operator) {
        cards.replaceAll(operator);
    }

    public void sort(Comparator<? super Card> c) {
        cards.sort(c);
    }

    public void clear() {
        cards.clear();
    }

    public Card get(int index) {
        return cards.get(index);
    }

    public Card set(int index, Card element) {
        return cards.set(index, element);
    }

    public void add(int index, Card element) {
        cards.add(index, element);
    }

    public Card remove(int index) {
        return cards.remove(index);
    }

    public int indexOf(Object o) {
        return cards.indexOf(o);
    }

    public int lastIndexOf(Object o) {
        return cards.lastIndexOf(o);
    }

    public ListIterator<Card> listIterator() {
        return cards.listIterator();
    }

    public ListIterator<Card> listIterator(int index) {
        return cards.listIterator(index);
    }

    public List<Card> subList(int fromIndex, int toIndex) {
        return cards.subList(fromIndex, toIndex);
    }

    public Spliterator<Card> spliterator() {
        return cards.spliterator();
    }

    public boolean removeIf(Predicate<? super Card> filter) {
        return cards.removeIf(filter);
    }

    public Stream<Card> stream() {
        return cards.stream();
    }

    public Stream<Card> parallelStream() {
        return cards.parallelStream();
    }

    public void forEach(Consumer<? super Card> action) {
        cards.forEach(action);
    }
}
