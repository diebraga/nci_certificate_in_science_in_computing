package nci_certificate_in_science_in_computing.softwareDevelopment.week4Lab.CodeRunner;

import java.util.Scanner;

public class PositiveNegative {
    private int num;
    private String answer;

    public void setNum(int num) {
        this.num = num;
    }

    public String getAnswer() {
        return answer;
    }

    public void computePostiveNegative() {
        if (num > 0) {
            answer = "positive";
        } else if (num < 0) {
            answer = "negative";
        } else {
            answer = "zero";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int inputNum = scanner.nextInt();

        PositiveNegative pn = new PositiveNegative();
        pn.setNum(inputNum);
        pn.computePostiveNegative();

        System.out.println(pn.getAnswer());

        scanner.close();
    }
}
package nci_certificate_in_science_in_computing.softwareDevelopment.week4Lab.CodeRunner;

import java.util.Scanner;

public class PositiveNegative {
    private int num;
    private String answer;

    public void setNum(int num) {
        this.num = num;
    }

    public String getAnswer() {
        return answer;
    }

    public void computePostiveNegative() {
        if (num > 0) {
            answer = "positive";
        } else if (num < 0) {
            answer = "negative";
        } else {
            answer = "zero";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int inputNum = scanner.nextInt();

        PositiveNegative pn = new PositiveNegative();
        pn.setNum(inputNum);
        pn.computePostiveNegative();

        System.out.println(pn.getAnswer());

        scanner.close();
    }
}
