/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registration;

/**
 *
 * @author RC_Student_lab
 */
import javax.swing.JOptionPane;

public class Login {
    public static void main(String[] args) {
        // usage of Registration and Login
        String username = JOptionPane.showInputDialog("Enter username:");
        String password = JOptionPane.showInputDialog("Enter password:");
        String firstName = JOptionPane.showInputDialog("Enter first name:");
        String lastName = JOptionPane.showInputDialog("Enter last name:");

        // Register a new user
        Registration newUser = new Registration(username, password, firstName, lastName);
        String registrationStatus = newUser.registerUser();
        JOptionPane.showMessageDialog(null, registrationStatus);

        // Attempt to login with registered user's credentials
        if (registrationStatus.equals("User successfully registered.")) {
            String enteredUsername = JOptionPane.showInputDialog("Enter your username to login:");
            String enteredPassword = JOptionPane.showInputDialog("Enter your password to login:");
            boolean loginStatus = newUser.loginUser(enteredUsername, enteredPassword);
            if (!loginStatus) {
                JOptionPane.showMessageDialog(null, "Login failed. Please try again.");
            }
        }
    }
}

