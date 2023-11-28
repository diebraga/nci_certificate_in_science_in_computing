package softwareDevelopment.week10Lab.NumberArrGeneratorApp;

import java.util.Scanner;

public class NumberArrGeneratorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers separated by spaces:");
        String line = scanner.nextLine();
        String[] numberStrings = line.split("\\s+");
        int[] numbers = new int[numberStrings.length];
        for (int i = 0; i < numberStrings.length; i++) {
            numbers[i] = Integer.parseInt(numberStrings[i]);
        }

        NumberArrGenerator details = new NumberArrGenerator(numbers);

        System.out.println("Sum of array: " + details.getSum());
        System.out.println("Max value in array: " + details.getMax());

        scanner.close();
    }
}
