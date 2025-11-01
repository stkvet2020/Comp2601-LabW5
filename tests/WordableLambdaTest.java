import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class WordableLambdaTest {

    @Test
    @DisplayName("Test concat lambda with empty string and zero")
    void testConcatLambda() {
        Wordable concat = (s, n) -> {
            String result = "";
            for (String word : WordDictionary.getWords()) {
                result += word;
            }
            return result;
        };
        String expected = "jabjabbedjabberjacarandajackiejackingjacksjacobinjactusjacuzzijacuzzisjadejadedjadeitejadeitesjailorsjailsjaipurjalousiesjamjamaicajamaicanjamaicansjambjamboreejamboreesjambsjamesjameyjamiejammedjammingjammyjamsjanjanglingjanicejapanjapanesejapejawboningjawingjawsjayjaysjayveesjaywalkjazzy";
        assertEquals(expected, concat.createString("", 0));
    }

    @Test
    @DisplayName("Test repeat lambda with empty string and repeat count 2")
    void testRepeatLambda() {
        Wordable repeat = (s, n) -> {
            String result = "";
            for (String word : WordDictionary.getWords()) {
                result += word.repeat(n);
            }
            return result;
        };
        String expected = "jabjabjabbedjabbedjabberjabberjacarandajacarandajackiejackiejackingjackingjacksjacksjacobinjacobinjactusjactusjacuzzijacuzzijacuzzisjacuzzisjadejadejadedjadedjadeitejadeitejadeitesjadeitesjailorsjailorsjailsjailsjaipurjaipurjalousiesjalousiesjamjamjamaicajamaicajamaicanjamaicanjamaicansjamaicansjambjambjamboreejamboreejamboreesjamboreesjambsjambsjamesjamesjameyjameyjamiejamiejammedjammedjammingjammingjammyjammyjamsjamsjanjanjanglingjanglingjanicejanicejapanjapanjapanesejapanesejapejapejawboningjawboningjawingjawingjawsjawsjayjayjaysjaysjayveesjayveesjaywalkjaywalkjazzyjazzy";
        assertEquals(expected, repeat.createString("", 2));
    }


    @Test
    @DisplayName("Test nth lambda with first argument 'nth' and no second argument:")
    void testNthLambda() {Wordable nth = (s, n) -> {
        String result = "";
            if (n >= 0 && n < WordDictionary.getWords().size()) {
                result= WordDictionary.getWords().get(n);}

        
        return result;
    };
        String expected = "jabber";
        assertEquals(expected, nth.createString("nth", 2)) ;

} // end of nth

}