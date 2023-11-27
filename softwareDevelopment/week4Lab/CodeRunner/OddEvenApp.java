package softwareDevelopment.week4Lab.CodeRunner;

import java.util.Scanner;

public class OddEvenApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int inputNum = scanner.nextInt();

        OddEven oe = new OddEven();
        oe.setNum(inputNum);
        oe.computeOddEven();

        System.out.println(oe.getAnswer());

        scanner.close();
    }
}
