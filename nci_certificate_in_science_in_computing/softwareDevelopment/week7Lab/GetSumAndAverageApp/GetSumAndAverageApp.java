package softwareDevelopment.week7Lab.GetSumAndAverageApp;

import java.util.Random;
import java.util.stream.IntStream;

public class GetSumAndAverageApp {
    public static void main(String[] args) {
        Random random = new Random();

        // arr leght 10 with random numbers from 1 to 100 functional way
        int[] numbers = IntStream.range(0, 10)
                .map(i -> random.nextInt(100) + 1)
                .toArray();

        int sum = getSum(numbers);
        double mean = getMean(numbers);

        System.out.print("the numbers in the array are: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println("sum of numbers in the array: " + sum);
        System.out.println("mean of numbers in the array: " + mean);
    }

    public static int getSum(int[] arr) {
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        return total;
    }

    public static double getMean(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        return (double) getSum(arr) / arr.length;
    }
}
