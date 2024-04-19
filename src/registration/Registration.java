import javax.swing.JOptionPane;

public class Registration {
    private String username;
    private String password;
    private String firstName;
    private String lastName;

    public Registration(String username, String password, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean checkUserName() {
        // Check if username contains an underscore and is no more than 5 characters long
        if (username.contains("_") && username.length() <= 5) {
            JOptionPane.showMessageDialog(null, "Username successfully captured");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");
            return false;
        }
    }

    public boolean checkPasswordComplexity() {
        // Check password complexity rules
        boolean isValid = password.length() >= 8 &&
                password.matches(".*[A-Z].*") &&
                password.matches(".*\\d.*") &&
                password.matches(".*[!@#$%^&*()-_=+{};:,<.>/?].*");

        if (isValid) {
            JOptionPane.showMessageDialog(null, "Password successfully captured");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number, and a special character.");
            return false;
        }
    }

    public String registerUser() {
        if (!checkUserName() || !checkPasswordComplexity()) {
            return "Registration failed. Please check username and password format.";
        }

        // If both username and password are valid, register the user
        return "User successfully registered.";
    }

    public boolean loginUser(String enteredUsername, String enteredPassword) {
        // Check if the entered username and password match the registered user's credentials
        if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
            JOptionPane.showMessageDialog(null, "Welcome " + firstName + " " + lastName + ", it is great to see you again.");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Username or password incorrect, please try again.");
            return false;
        }
    }
}
