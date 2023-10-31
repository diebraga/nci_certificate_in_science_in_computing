package softwareDevelopment.week7Lab.LargestInTheArrApp;

import java.util.Random;

public class LargestInTheArrApp {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numbers = new int[10];

        // arr leght 10 with random numbers from 1 to 100
        for (int i = 0; i < 10; i++) {
            numbers[i] = random.nextInt(100) + 1;
        }

        System.out.print("the numbers in the array are: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        int largestNumber = findLargest(numbers);

        System.out.println("the largest number is: " + largestNumber);
    }

    public static int findLargest(int[] array) {
        int largest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        return largest;
    }
}
