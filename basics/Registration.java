import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Registration extends JFrame implements ActionListener {

// Declare some Swing components
private JLabel nameLabel, emailLabel, usernameLabel, passwordLabel;
private JTextField nameField, emailField, usernameField;
private JPasswordField passwordField;
private JButton registerButton, resetButton;

// Constructor
public Registration() {
// Set title of JFrame
super("Registration Form");

// Set size of JFrame
setSize(400, 300);

// Set layout of JFrame's content pane
getContentPane().setLayout(new GridLayout(5, 2));

// Initialize Swing components
nameLabel = new JLabel("Name:");
emailLabel = new JLabel("Email:");
usernameLabel = new JLabel("Username:");
passwordLabel = new JLabel("Password:");
nameField = new JTextField(20);
emailField = new JTextField(20);
usernameField = new JTextField(20);
passwordField = new JPasswordField(20);
registerButton = new JButton("Register");
resetButton = new JButton("Reset");

// Add action listeners to buttons
registerButton.addActionListener(this);
resetButton.addActionListener(this);

// Add Swing components to JFrame's content pane
getContentPane().add(nameLabel);
getContentPane().add(nameField);
getContentPane().add(emailLabel);
getContentPane().add(emailField);
getContentPane().add(usernameLabel);
getContentPane().add(usernameField);
getContentPane().add(passwordLabel);
getContentPane().add(passwordField);

getContentPane().add(registerButton);
getContentPane().add(resetButton);

// Set default close operation of JFrame
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

// Make JFrame visible
setVisible(true);
}

// Define action performed method for action listener
public void actionPerformed(ActionEvent e) {
// Get source of action event
Object source = e.getSource();

// If source is register button
if (source == registerButton) {
// Get values from text fields
String name = nameField.getText();
String email = emailField.getText();
String username = usernameField.getText();
String password = String.valueOf(passwordField.getPassword());

// Validate values
if (name.isEmpty() || email.isEmpty() || username.isEmpty() || password.isEmpty()) {
// Show error message
JOptionPane.showMessageDialog(this,"Please fill all fields","Error",JOptionPane.ERROR_MESSAGE);
} else {
// Show success message
JOptionPane.showMessageDialog(this,"Registration successful","Success",JOptionPane.INFORMATION_MESSAGE);
// Clear text fields
nameField.setText("");
emailField.setText("");
usernameField.setText("");