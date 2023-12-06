import java.util.Scanner;

// Ex of valid input
// Enter the email address to validate:
// diebr@gmail.com
// A valid domain extension is a string like 'com', 'org', 'net', etc.
// Enter the number of valid domain extensions:
// 3
// Now enter each valid domain extension:
// com
// org
// net
// Valid domain extensions entered: 
// com
// org
// net
// Email is valid.

public class EmailValidator {
    private String validationResult;

    public void validateEmail(String email, String[] validExtensions) {
        if (!email.contains("@")) {
            validationResult = "Invalid email: no '@' symbol found.";
            return;
        }

        int indexOfAt = email.indexOf('@');
        int indexOfDot = email.lastIndexOf('.');
        if (indexOfDot <= indexOfAt || indexOfDot >= email.length() - 1) {
            validationResult = "Invalid email: incorrect placement of '.' or missing domain extension.";
            return;
        }

        String domainExtension = email.substring(indexOfDot + 1);
        for (String validExtension : validExtensions) {
            if (domainExtension.equals(validExtension)) {
                validationResult = "Email is valid.";
                return;
            }
        }

        validationResult = "Invalid email: domain extension not recognized.";
    }

    public String getValidationResult() {
        return validationResult;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmailValidator emailValidator = new EmailValidator();

        System.out.println("Enter the email address to validate:");
        String email = scanner.nextLine();

        System.out.println("A valid domain extension is a string like 'com', 'org', 'net', etc.");
        System.out.println("Enter the number of valid domain extensions:");
        int numberOfExtensions = Integer.parseInt(scanner.nextLine());
        String[] validExtensions = new String[numberOfExtensions];

        System.out.println("Now enter each valid domain extension:");
        for (int i = 0; i < numberOfExtensions; i++) {
            validExtensions[i] = scanner.nextLine();
        }

        // Print the valid domain extensions for confirmation
        System.out.println("Valid domain extensions entered: ");
        for (String extension : validExtensions) {
            System.out.println(extension);
        }

        emailValidator.validateEmail(email, validExtensions);
        System.out.println(emailValidator.getValidationResult());

        scanner.close();
    }
}
