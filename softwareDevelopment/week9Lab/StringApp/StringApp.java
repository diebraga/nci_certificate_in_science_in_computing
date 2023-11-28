package softwareDevelopment.week9Lab.StringApp;

import java.util.Scanner;

public class StringApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String input = scanner.nextLine();
        scanner.close();

        StringProcessor stringProcessor = new StringProcessor(input);
        System.out.println("Letter count: " + stringProcessor.countLetters());
        System.out.println("Vowel count: " + stringProcessor.countVowels());
        System.out.println("Every second letter: " + stringProcessor.getEverySecondLetter());
        System.out.println("Position of each space: " + stringProcessor.getSpacePositions());
        System.out.println("Exclamation point String: " + stringProcessor.replaceVowelsWithExclamation());
    }
}

class StringProcessor {
    private String input;

    public StringProcessor(String input) {
        this.input = input;
    }

    public int countLetters() {
        // Count all characters except full stops
        return input.replaceAll("\\.", "").length();
    }

    public int countVowels() {
        int count = 0;
        for (char c : input.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public String getEverySecondLetter() {
        StringBuilder result = new StringBuilder();
        // Start from the second character (index 1)
        for (int i = 1; i < input.length(); i += 2) {
            result.append(input.charAt(i));
        }
        return result.toString();
    }

    public String getSpacePositions() {
        StringBuilder positions = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                if (positions.length() > 0) {
                    positions.append(",");
                }
                positions.append(i);
            }
        }
        return positions.toString();
    }

    public String replaceVowelsWithExclamation() {
        return input.replaceAll("[AEIOUaeiou]", "!");
    }
}
