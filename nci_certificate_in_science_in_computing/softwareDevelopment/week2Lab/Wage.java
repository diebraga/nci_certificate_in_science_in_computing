import java.util.Scanner;
import java.util.NoSuchElementException;
import java.util.InputMismatchException;

public class Wage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // the expected output should allow the user know what he has to input :(
            int monthlyWage = sc.nextInt();

            int hoursWorked = sc.nextInt();

            int annualWage = calculateAnnualWage(monthlyWage);
            int perHourRate = calculatePerHourRate(monthlyWage, hoursWorked);

            System.out.println("Annual wage: " + annualWage);
            System.out.println("Per hour rate: " + perHourRate);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers only.");
        } catch (NoSuchElementException e) {
            System.out.println("No input provided. Please run the program again and provide input as prompted.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }

    public static int calculateAnnualWage(int monthlyWage) {
        return monthlyWage * 12;
    }

    public static int calculatePerHourRate(int monthlyWage, int hoursWorked) {
        // 4.33 weeks per month
        return (int) (monthlyWage / (hoursWorked * 4.33));
    }
}
