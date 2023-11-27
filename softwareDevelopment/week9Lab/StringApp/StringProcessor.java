package softwareDevelopment.week9Lab.StringApp;

import java.util.ArrayList;
import java.util.List;

public class StringProcessor {
    private String input;

    public StringProcessor(String input) {
        this.input = input;
    }

    public int countLetters() {
        return input.replaceAll("[^a-zA-Z]", "").length();
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
        for (int i = 1; i < input.length(); i += 2) {
            result.append(input.charAt(i));
        }
        return result.toString();
    }

    public List<Integer> getSpacePositions() {
        List<Integer> positions = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                positions.add(i);
            }
        }
        return positions;
    }

    public String replaceVowelsWithExclamation() {
        return input.replaceAll("[AEIOUaeiou]", "!");
    }
}
