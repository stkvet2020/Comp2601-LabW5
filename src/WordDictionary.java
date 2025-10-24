import java.util.Arrays;
import java.util.List;

/**
 * A dictionary class containing a predefined list of words.
 * This class provides a static list of words for use in the application.
 * @author stephan knappstein A01208242
 * @version 1.0
 */
public class WordDictionary {

    private static final List<String> MORE_WORDS_THAT_BEGIN_WITH_JA;

    static {
        MORE_WORDS_THAT_BEGIN_WITH_JA = Arrays.asList(
                "jab",
                "jabbed",
                "jabber",
                "jacaranda",
                "jackie",
                "jacking",
                "jacks",
                "jacobin",
                "jactus",
                "jacuzzi",
                "jacuzzis",
                "jade",
                "jaded",
                "jadeite",
                "jadeites",
                "jailors",
                "jails",
                "jaipur",
                "jalousies",
                "jam",
                "jamaica",
                "jamaican",
                "jamaicans",
                "jamb",
                "jamboree",
                "jamborees",
                "jambs",
                "james",
                "jamey",
                "jamie",
                "jammed",
                "jamming",
                "jammy",
                "jams",
                "jan",
                "jangling",
                "janice",
                "japan",
                "japanese",
                "jape",
                "jawboning",
                "jawing",
                "jaws",
                "jay",
                "jays",
                "jayvees",
                "jaywalk",
                "jazzy"
        );
    }

    

    /**
     * Private constructor to prevent instantiation of this utility class.
     */
    private WordDictionary() {
        // This class is not meant to be instantiated.
    }
/**
     * Gets the list of words from the dictionary.
     *
     * @return An immutable list of words.
     */
    public static List<String> getWords() {
        return MORE_WORDS_THAT_BEGIN_WITH_JA;
    }

      /**
     * A Wordable method.
     * @param wordArg A string input.
     * @param numberArg An int input.
     * @param w A Wordable input.
     * @return the input String and int.
     */
    public String getWords(String wordArg, int numberArg, Wordable w) {
        // Set to take the same amount of variables as wordable. One string and one Int.

        // Returns worables createString method, passing in the two variables taken.
        return w.createString(wordArg, numberArg);

    }
   


}
