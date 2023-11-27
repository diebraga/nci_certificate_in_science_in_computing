package softwareDevelopment.week8Lab.FourYearsGradesApp;

import java.util.Scanner;

public class FourYearsGradesApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int YEARS = 4;
        int RESULTS_PER_YEAR = 5;

        int[][] grades = new int[YEARS][RESULTS_PER_YEAR];
        int[] yearlyAverage = new int[YEARS];
        int totalAverageSum = 0;

        // loop years
        for (int year = 0; year < YEARS; year++) {
            System.out.println("type your grades for year " + (year + 1) + ":");
            int sumForYear = 0;

            // loop results
            for (int result = 0; result < RESULTS_PER_YEAR; result++) {
                System.out.print("result " + (result + 1) + " from 0 to 100: ");
                int grade = scanner.nextInt();

                while (grade < 0 || grade > 100) {
                    System.out.println("invalid input enter a number from 0 to 100.");
                    System.out.print("result " + (result + 1) + " (0-100): ");
                    grade = scanner.nextInt();
                }

                grades[year][result] = grade;
                sumForYear += grade;
            }

            yearlyAverage[year] = sumForYear / RESULTS_PER_YEAR;
            totalAverageSum += yearlyAverage[year];
        }

        int totalAverage = totalAverageSum / YEARS;

        // Display results
        for (int year = 0; year < YEARS; year++) {
            System.out.println("Average for year " + (year + 1) + ": " + yearlyAverage[year]);
        }
        System.out.println("Total average over " + YEARS + " years: " + totalAverage);
    }
}
