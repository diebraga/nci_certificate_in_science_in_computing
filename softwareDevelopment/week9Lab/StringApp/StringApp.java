package softwareDevelopment.week9Lab.StringApp;

import java.util.Scanner;

public class StringApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("type your string: ");
        String input = scanner.nextLine();

        StringProcessor stringProcessor = new StringProcessor(input);
        System.out.println("total letters: " + stringProcessor.countLetters());
        System.out.println("total vowels: " + stringProcessor.countVowels());
        System.out.println("string with every second letter: " + stringProcessor.getEverySecondLetter());
        System.out.println("positions of spaces: " + stringProcessor.getSpacePositions());
        System.out
                .println("String with vowels as exclamation points: " + stringProcessor.replaceVowelsWithExclamation());
    }
}
