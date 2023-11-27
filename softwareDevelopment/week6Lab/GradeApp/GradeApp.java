package softwareDevelopment.week6Lab.GradeApp;

import java.util.Scanner;

public class GradeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter how many subjects you studied:");
        int numberOfSubjects = scanner.nextInt();
        scanner.nextLine(); // consume the leftover newline

        if (numberOfSubjects < 1) {
            System.out.println("No subjects to be graded");
            return;
        }

        double totalMarks = 0;
        for (int i = 1; i <= numberOfSubjects; i++) {
            System.out.println("Marks for subject " + i + ":");
            double mark = scanner.nextDouble();
            scanner.nextLine();
            while (mark < 0 || mark > 100) {
                System.out.println("Invalid mark. Please enter a value between 0 and 100.");
                System.out.println("Marks for subject " + i + ":");
                mark = scanner.nextDouble();
                scanner.nextLine();
            }
            totalMarks += mark;
        }

        // calculate average
        double average = totalMarks / numberOfSubjects;
        System.out.printf("The average is: %.0f%n", average);
        if (average >= 90) {
            System.out.println("Grade: A");
        } else if (average >= 75) {
            System.out.println("Grade: B");
        } else if (average >= 60) {
            System.out.println("Grade: C");
        } else if (average >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }
}
