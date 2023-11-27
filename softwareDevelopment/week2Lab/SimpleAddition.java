import javax.swing.JOptionPane;

public class SimpleAddition {
    public static void main(String[] args) {
        int firstInput = getUserInput("Enter the first number");
        int secondInput = getUserInput("Enter the second number");
        System.out.println(firstInput + secondInput);
    }

    private static int getUserInput(String message) {
        return Integer.parseInt(JOptionPane.showInputDialog(null, message));
    }
}
