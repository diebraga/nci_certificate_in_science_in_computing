package nci_certificate_in_science_in_computing.softwareDevelopment.week4Lab.CodeRunner;

public class OddEven {
    private int num;
    private String answer;

    public void setNum(int num) {
        this.num = num;
    }

    public String getAnswer() {
        return answer;
    }

    public void computeOddEven() {
        if (num % 2 == 0) {
            answer = "even";
        } else {
            answer = "odd";
        }
    }
}
