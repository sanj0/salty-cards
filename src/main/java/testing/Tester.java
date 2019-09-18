package testing;

import de.edgelord.saltycards.collection.CardCollection;

public class Tester {

    public static void main(String[] args) {

        CardCollection completeCollection = CardCollection.completeSet();
        completeCollection.forEach(System.out::println);
    }
}
