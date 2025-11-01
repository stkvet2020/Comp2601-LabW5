import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;




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

    @Test
    @DisplayName("Test reverse lambda with first argument 'reverse' and no second argument:")
    void testReverseLambda() {
        Wordable reverse = (s, n) -> {
            String result = "";
            for (String word : WordDictionary.getWords()) {
                String reversedWord = "";
                for (int i = word.length() - 1; i >= 0; i--) {
                    reversedWord += word.charAt(i);
                }
                result += reversedWord;
            }
            return result;

                };
        String expected = "bajdebbajrebbajadnaracajeikcajgnikcajskcajnibocajsutcajizzucajsizzucajedajdedajetiedajsetiedajsroliajsliajrupiajseisuolajmajaciamajnaciamajsnaciamajbmajeerobmajseerobmajsbmajsemajyemajeimajdemmajgnimmajymmajsmajnajgnilgnajecinajnapajesenapajepajgninobwajgniwajswajyajsyajseevyajklawyajyzzaj";
        assertEquals(expected, reverse.createString("reverse", 0));

    }

    @Test
    @DisplayName("Testing the method reference -printAll")
    void testPrintAll(){
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Main.printAll();
        System.setOut(originalOut);
        StringBuilder expectedOutput = new StringBuilder();
        expectedOutput.append("\nDefault implementation of method reference:");
        expectedOutput.append("\n    All words in the dictionary:");
        expectedOutput.append(System.lineSeparator());
        WordDictionary.getWords().forEach(word -> expectedOutput.append(word).append(System.lineSeparator()));


        assertEquals(expectedOutput.toString().trim(), outContent.toString().trim());

    }// end of function



}