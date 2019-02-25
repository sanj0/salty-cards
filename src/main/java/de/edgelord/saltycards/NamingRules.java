package de.edgelord.saltycards;

/**
 * An interface for naming objects.
 *
 * @param <T> the kind of object that this set of rules can name.
 */
public interface NamingRules< T > {

    /**
     * Returns the name of the given object.
     *
     * @param object the object
     * @return th name of the object
     */
    String getName(T object);

    static String getName(Object object, NamingRules<Object> namingRules) {
        return namingRules.getName(object);
    }
}
