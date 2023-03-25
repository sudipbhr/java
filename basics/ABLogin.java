import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;


public class ABLogin implements ActionListener{
    JTextField tf1;
    JPasswordField tf2;
    JLabel l1, l2, l3;
    JButton b1;
    JDialog d;
    Connection conn = null;
    Statement stmt = null;

    ABLogin(){
        d=new JDialog();
        d.setTitle("Login");
        d.setSize(720, 750);
        d.setLayout(null);
        d.setVisible(true);
        // d.setModel(true);
        d.setLocation(200,100);
        // d.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        
        // making database connection
        // Class.forName("com.mysql.jdbc.Driver");
        // DriverManager.getConnection("jdbc:mysql://localhost/java", "root", "");
        // stmt = conn.createStatement();
        Font f1 = new Font("Lucida Handwriting", Font.ITALIC, 18);
        l3 = new JLabel("Welcome to Sudip's Log Book");
        l3.setBounds(100, 10, 300, 40);
        l3.setFont(f1);
        d.add(l3);
        l1 = new JLabel("Username");
        l2 = new JLabel("Password");
        l1.setBounds(50,70,100,25);
        l2.setBounds(50,100,100,25);
        tf1 = new JTextField();
        tf1.setBounds(160, 70, 100, 25);
        d.add(tf1);
        d.add(l1);
        d.add(l2);
        tf2 = new JPasswordField();
        tf2.setBounds(160,100,100,25);
        d.add(tf2);
        b1= new JButton ("Login");
        b1.setBounds(150, 140, 100, 25);
        d.add(b1);
        b1.addActionListener(this);
        d.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        System.out.println("Welcome to the Login system");
    }
    public static void main(String[] args){
        new ABLogin();
    }
}