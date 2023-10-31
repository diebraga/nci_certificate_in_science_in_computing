package softwareDevelopment.week7Lab.SecretNumberApp;

import java.util.Random;
import java.util.Scanner;

public class SecretNumberApp {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        // int arr of 5
        int[] numbers = new int[5];

        // arr leght 10 with random numbers from 1 to 10
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10) + 1;
        }

        System.out.print("the numbers in the array are: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.println("enter a number between 1 and 10 to check its occurrence in the array:");
        int userInput = scanner.nextInt();

        if (userInput < 1 || userInput > 10) {
            System.out.println("Invalid input! Please enter a number between 1 and 10.");
        } else {
            int occurrence = countOccurrence(numbers, userInput);
            System.out.println(userInput + " occurs " + occurrence + " times in the array.");
        }
    }

    // help occ func
    public static int countOccurrence(int[] arr, int num) {
        int count = 0;
        for (int value : arr) {
            if (value == num) {
                count++;
            }
        }
        return count;
    }
}
