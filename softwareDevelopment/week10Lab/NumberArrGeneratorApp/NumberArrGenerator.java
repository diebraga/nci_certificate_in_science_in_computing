package softwareDevelopment.week10Lab.NumberArrGeneratorApp;

public class NumberArrGenerator {
    private int[] array;
    private int sum;
    private int max;

    public NumberArrGenerator(int[] array) {
        this.array = array;
        calculateSumAndMax();
    }

    // Method to calculate the sum and the maximum value
    private void calculateSumAndMax() {
        sum = 0;
        max = array.length > 0 ? array[0] : Integer.MIN_VALUE;
        for (int num : array) {
            sum += num;
            if (num > max) {
                max = num;
            }
        }
    }

    // Method to get the maximum value
    public int getMax() {
        return max;
    }

    // Method to get the sum of the array
    public int getSum() {
        return sum;
    }
}
