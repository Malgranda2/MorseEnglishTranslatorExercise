import classes.MorseTranslator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class TestCases {

    @Test
    public void englishToMorseTranslateLetterA() {
        //ARRANGE
        MorseTranslator morseTranslator = new MorseTranslator();
        String expected = ".-";
        String actual = "";

        //ACT
        actual = morseTranslator.translateSingleLetterToMorse('A');

        //ASSERT
        assertEquals(expected, actual);
    }

    @Test
    public void MorseToEnglishTranslateLetterA() {
        //ARRANGE
        MorseTranslator morseTranslator = new MorseTranslator();
        char expected = 'A';
        char actual ='0';

        //ACT
        actual = morseTranslator.translateMorseToSingleLetter(".-");

        //ASSERT
        assertEquals(expected, actual);
    }

    @Test
    public void englishToMorseTranslateWordHello() {
        //ARRANGE
        MorseTranslator morseTranslator = new MorseTranslator();
        String expected = ".... . .-.. .-.. ---";
        String actual = "";

        //ACT
        actual = morseTranslator.translateWordToMorse("Hello");

        //ASSERT
        assertEquals(expected, actual);
    }

    @Test
    public void morseToEnglishTranslateWordHello() {
        //ARRANGE
        MorseTranslator morseTranslator = new MorseTranslator();
        String expected = "HELLO";
        String actual = "";

        //ACT
        actual = morseTranslator.translateMorseToEnglish(".... . .-.. .-.. ---");

        //ASSERT
        assertEquals(expected, actual);
    }

    @Test
    public void invalidInputMorseToEnglish() {
        //ARRANGE
        MorseTranslator morseTranslator = new MorseTranslator();
        String expected = "!";
        String actual = "";

        //ACT
        actual = morseTranslator.translateMorseToEnglish("a");

        //ASSERT
        assertEquals(expected, actual);
    }

    @Test
    public void invalidInputEnglishToMorse() {
        //ARRANGE
        MorseTranslator morseTranslator = new MorseTranslator();
        String expected = "!";
        String actual = "";

        //ACT
        actual = morseTranslator.translateWordToMorse("1");

        //ASSERT
        assertEquals(expected, actual);
    }

}
