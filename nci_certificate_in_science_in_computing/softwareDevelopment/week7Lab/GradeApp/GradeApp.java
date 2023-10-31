package softwareDevelopment.week7Lab.GradeApp;

import java.util.Scanner;

public class GradeApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter how many subjects you studied:");
        int numberOfSubjects = scanner.nextInt();
        scanner.nextLine();

        if (numberOfSubjects < 1) {
            System.out.println("No subjects to be graded");
            return;
        }

        // initialise arr
        double[] marks = new double[numberOfSubjects];
        double totalMarks = 0;

        // loop
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.println("Marks for subject " + (i + 1) + ":");
            // assign values to each arr index
            marks[i] = scanner.nextDouble();
            scanner.nextLine();
            while (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid mark. Please enter a value between 0 and 100.");
                System.out.println("Marks for subject " + (i + 1) + ":");
                marks[i] = scanner.nextDouble();
                scanner.nextLine();
            }
            totalMarks += marks[i];
        }

        // Calculate and display average
        double average = totalMarks / numberOfSubjects;
        System.out.printf("Overall average: %.2f%n", average);

        // Display marks and grades for each subject
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.printf("Marks for subject %d: %.2f Grade: %s%n", (i + 1), marks[i], getGrade(marks[i]));
        }
    }

    // get grade helper
    public static String getGrade(double mark) {
        if (mark >= 90)
            return "A";
        if (mark >= 80)
            return "B";
        if (mark >= 70)
            return "C";
        if (mark >= 60)
            return "D";
        if (mark >= 50)
            return "E";
        return "F";
    }
}
