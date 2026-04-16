import java.util.*;

public class PasswordValidator {

    public static boolean isValidPassword(String password) {
        boolean hasUppercase = false;
        boolean hasDigit = false;

        if (password.length() < 8) {
            System.out.println("Password too short (minimum 8 characters are required)");
            return false;
        }

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            }

            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }

        if (!hasUppercase) {
            System.out.println("Missing an uppercase letter, you need at least one uppercase letter");
            return false;
        }

        if (!hasDigit) {
            System.out.println("Missing a digit, you need at least one digit");
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password;

        while (true) {
            System.out.print("Enter your password: ");
            password = sc.nextLine();

            if (isValidPassword(password)) {
                System.out.println("Password is strong and valid, you can use it.");
                break;
            } else {
                System.out.println("Please try again.\n");
            }
        }

    }
}