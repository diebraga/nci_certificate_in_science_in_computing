import java.util.Scanner;

public class YearBorn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Please enter the current year: ");
        int currentYear = scanner.nextInt();

        int birthYear = calculateBirthYear(currentYear, age);

        System.out.println("You were born in the year: " + birthYear);

        scanner.close();
    }

    private static int calculateBirthYear(int currentYear, int age) {
        return currentYear - age;
    }
}
