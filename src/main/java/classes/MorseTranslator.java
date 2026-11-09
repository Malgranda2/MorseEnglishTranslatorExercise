package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MorseTranslator {

    HashMap<Character,String> englishToMorse = new HashMap<>();
    HashMap<String, String> morseToEnglish = new HashMap<>();



    public MorseTranslator() {
        englishToMorse.put('A', ".-");
        englishToMorse.put('B', "-...");
        englishToMorse.put('C', "-.-.");
        englishToMorse.put('D', "-..");
        englishToMorse.put('E', ".");
        englishToMorse.put('F', "..-.");
        englishToMorse.put('G', "--.");
        englishToMorse.put('H', "....");
        englishToMorse.put('I', "..");
        englishToMorse.put('J', ".---");
        englishToMorse.put('K', "-.-");
        englishToMorse.put('L', ".-..");
        englishToMorse.put('M', "--");
        englishToMorse.put('N', "-.");
        englishToMorse.put('O', "---");
        englishToMorse.put('P', ".--.");
        englishToMorse.put('Q', "--.-");
        englishToMorse.put('R', ".-.");
        englishToMorse.put('S', "...");
        englishToMorse.put('T', "-");
        englishToMorse.put('U', "..-");
        englishToMorse.put('V', "...-");
        englishToMorse.put('W', ".--");
        englishToMorse.put('X', "-..-");
        englishToMorse.put('Y', "-.--");
        englishToMorse.put('Z', "--..");

        morseToEnglish.put(".-", "A");
        morseToEnglish.put("-...", "B");
        morseToEnglish.put("-.-.", "C");
        morseToEnglish.put("-..", "D");
        morseToEnglish.put(".", "E");
        morseToEnglish.put("..-.", "F");
        morseToEnglish.put("--.", "G");
        morseToEnglish.put("....", "H");
        morseToEnglish.put("..", "I");
        morseToEnglish.put(".---", "J");
        morseToEnglish.put("-.-", "K");
        morseToEnglish.put(".-..", "L");
        morseToEnglish.put("--", "M");
        morseToEnglish.put("-.", "N");
        morseToEnglish.put("---", "O");
        morseToEnglish.put(".--.", "P");
        morseToEnglish.put("--.-", "Q");
        morseToEnglish.put(".-.", "R");
        morseToEnglish.put("...", "S");
        morseToEnglish.put("-", "T");
        morseToEnglish.put("..-", "U");
        morseToEnglish.put("...-", "V");
        morseToEnglish.put(".--", "W");
        morseToEnglish.put("-..-", "X");
        morseToEnglish.put("-.--", "Y");
        morseToEnglish.put("--..", "Z");

    }

    public String translateSingleLetterToMorse(char letter) {
        String buffer = englishToMorse.get(Character.toUpperCase(letter));
        try {
            buffer.isEmpty();
            return buffer;
        }
        catch (Exception e){
            System.out.println("Invalid character detected. Only letters A - Z allowed and Morse characters need to be split from each other");
            return "!";
        }
    }

    public char translateMorseToSingleLetter(String morseLetter) {
        String stringBuffer = morseToEnglish.get(morseLetter);
        char charBuffer;
        try {
            charBuffer = stringBuffer.charAt(0);
        }
        catch (Exception e) {
            System.out.println("Invalid input. Only dots(.) and dashes(-) are allowed.");
            return '!';
        }

        return charBuffer;
    }

    public String translateWordToMorse(String word) {
        StringBuilder buffer = new StringBuilder();
        for (char letter : word.toCharArray()) {
            buffer.append(
                    translateSingleLetterToMorse(
                            Character.toUpperCase(letter)));
            buffer.append(" ");
        }
        return buffer.toString().trim();
    }

    public String translateMorseToEnglish(String morse) {
        ArrayList<String> buffer = new ArrayList<>(
                Arrays.stream(
                        morse.split(" "))
                        .toList());
        StringBuilder translatedString = new StringBuilder();

        for (String morseChar : buffer) {
            translatedString.append(
                    translateMorseToSingleLetter(morseChar));
        }
        return translatedString.toString();
    }
}
