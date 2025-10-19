/**
 * Represents an operation that takes a string and an integer and produces a string.
 * This is a functional interface whose functional method is {@link #createString(String, int)}.
 */
@FunctionalInterface
public interface Wordable {
    /**
     * Creates a new string based on the input string and integer.
     *
     * @param s the input string.
     * @param n the input integer.
     * @return the resulting string.
     */
    String createString(String s, int n);
}
