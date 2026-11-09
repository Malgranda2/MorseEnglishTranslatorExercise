import classes.*;

import java.util.Scanner;

public class Main {
    static void main() {
        MorseTranslator morseTranslator = new MorseTranslator();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        int selection = 0;
        String input = "";

        while (running) {
            System.out.println("1: Translate word to morse");
            System.out.println("2: Translate morse to words");
            System.out.println("3: Exit program");

            try {
                selection = scanner.nextInt();
            }
            catch (Exception e){}
            scanner.nextLine();

            switch (selection) {
                case 1: //Word to morse
                    System.out.println("Enter Word to translate to morse");
                    input = scanner.nextLine();
                    System.out.println(input + " translates to " + morseTranslator.translateWordToMorse(input));
                    break;
                case 2: //Morse to words
                    System.out.println("Enter morse to translate to words");
                    input = scanner.nextLine();
                    System.out.println(input + " translates to " + morseTranslator.translateMorseToEnglish(input));
                    break;
                case 3: //End
                    System.out.println("Exiting program...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid input, please try again.");
                    break;
            }
            input = "";
            selection = 0;
        }


    }
}
